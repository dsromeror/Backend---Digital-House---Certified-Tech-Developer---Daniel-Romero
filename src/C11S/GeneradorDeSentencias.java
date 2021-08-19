package C11S;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneradorDeSentencias {
    public static String generarInsert(Integer id, String tipo, String nombre){
        return "INSERT INTO animales (id, tipo, nombre) VALUES (" + id.toString() + ",'" + tipo + "','" + nombre + "')";
    }

    public static String generarSelectAll(){
        return "SELECT * FROM animales";
    }

    public static String generarDelete(Integer id){
        return "DELETE FROM animales WHERE id = " + id.toString();
    }

    /**
     * Arma una sentencia que crea una tabla en la base de datos
     * @param columnas Mapa<K, V> que contiene elementos cuya llave es el nombre(K) de la columna, y como valor(V) el tipo de dato de la columna.
     * @return La Sentencia SQL.
     */
    public static String crearTabla(Map<String, String> columnas){
        String sentencia =  "DROP TABLE IF EXISTS animales; CREATE TABLE animales (";

        Set<String> nombresDeLasColumnas = columnas.keySet();
        Iterator<String> iterador = nombresDeLasColumnas.iterator();

        while (iterador.hasNext()){
            String nombreDeLaColumna = iterador.next();
            sentencia = sentencia + nombreDeLaColumna + " " + columnas.get(nombreDeLaColumna);
            if(iterador.hasNext()){
                sentencia = sentencia + ", ";
            }
        }

        sentencia = sentencia + ")";

        return sentencia;
    }

}
