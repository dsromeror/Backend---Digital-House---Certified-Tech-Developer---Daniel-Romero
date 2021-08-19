package C11S;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection conexión = null;

        try {
            //1. Obtener un objeto Connection
            conexión = getConnection();

            //2. Crear el objeto tipo Statement para ejecutar las sentencias requeridas
            Statement sentencia = conexión.createStatement();

            //2a. Crear la tabla y crear algunos registros
            String sentenciaCrearTabla = GeneradorDeSentencias.crearTabla(Map.of("id", "INTEGER PRIMARY KEY",
                    "tipo", "VARCHAR(50)",
                    "nombre", "VARCHAR(50)"));
            System.out.println("- Sentencia a ejecutar: " + sentenciaCrearTabla);
            sentencia.execute(sentenciaCrearTabla);

            sentencia.execute(GeneradorDeSentencias.generarInsert(1, "Perro", "Pompilia"));
            sentencia.execute(GeneradorDeSentencias.generarInsert(2, "Perro", "Martín"));
            sentencia.execute(GeneradorDeSentencias.generarInsert(3, "Loro", "Maruja"));


            //2b. Borrar algún registro de la tabla
            sentencia.execute(GeneradorDeSentencias.generarDelete(1));

            //2c. Ejecutar una consulta y traer desde la base de datos los datos guardados anteriomente.
            ResultSet resultado = sentencia.executeQuery(GeneradorDeSentencias.generarSelectAll());

            while(resultado.next()){
                String registro = resultado.getInt("id") + " - " + resultado.getString("tipo") + " - " + resultado.getString("nombre");
                System.out.println(registro);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            //Siempre hay que cerrar la conexión para evitar cuellos de botella en el acceso de otras peticiones a la base de datos.
            conexión.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver"); // Cargar el controlador para la base de datos (H2 en este caso)
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", ""); //Generar un objeto que manejará la conexión con la base de datos
    }
}
