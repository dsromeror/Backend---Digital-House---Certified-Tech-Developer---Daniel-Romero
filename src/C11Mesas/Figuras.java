package C11Mesas;

import java.sql.*;

public class Figuras {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "sa", "myPassword");
            Statement stat = connection.createStatement();

            String createTable = "DROP TABLE IF EXISTS FIGURAS; CREATE TABLE FIGURAS(ID INT PRIMARY KEY, FIGURA VARCHAR(255), COLOR VARCHAR(255))";
            stat.execute(createTable);

            String insertarFila1 = "INSERT INTO FIGURAS VALUES(1, 'CIRCULO', 'NEGRO')";
            String insertarFila2 = "INSERT INTO FIGURAS VALUES(2, 'CIRCULO', 'ROJO')";
            String insertarFila3 = "INSERT INTO FIGURAS VALUES(3, 'CUADRADO', 'ROJO')";
            String insertarFila4 = "INSERT INTO FIGURAS VALUES(4, 'CUADRADO', 'AMARILLO')";
            String insertarFila5 = "INSERT INTO FIGURAS VALUES(5, 'CUADRADO', 'AZUL')";

            stat.execute(insertarFila1);
            stat.execute(insertarFila2);
            stat.execute(insertarFila3);
            stat.execute(insertarFila4);
            stat.execute(insertarFila5);

            String sql = "SELECT * FROM FIGURAS";
            ResultSet rd = stat.executeQuery(sql);
/*
        String querySQL = "SELECT * FROM FIGURAS WHERE FIGURA = 'CIRCULO' AND COLOR= 'ROJO'";
        System.out.println(stat.executeQuery(querySQL));


        while (rq.next()) {
            System.out.println(rq.getInt(1) + " " + rq.getString(2) + " " + rq.getString(3));
        }*/

            while (rd.next()) {
                System.out.println(rd.getInt(1) + " " + rd.getString(2) + " " + rd.getString(3));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            connection.close();
        }
    }
}