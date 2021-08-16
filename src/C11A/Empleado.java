package C11A;

import java.sql.*;

public class Empleado {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:"+"./Database/my","sa","myPassword");
        Statement stat = connection.createStatement();

        String createTable = "DROP TABLE IF EXISTS EMPLEADO; CREATE TABLE EMPLEADO(ID INT PRIMARY KEY, NAME VARCHAR(255), EMPRESA VARCHAR(255), FECHA DATE)";
        stat.execute(createTable);

        String insertarFila = "INSERT INTO EMPLEADO VALUES(1, 'DANIEL', 'DIGITAL', '2021-08-14')";
        String insertarFila2 = "INSERT INTO EMPLEADO VALUES(2, 'STEVEN', 'GOOGLE', '2021-08-14')";
        String insertarFila3 = "INSERT INTO EMPLEADO VALUES(3, 'STEVE', 'FACEBOOK', '2021-08-14')";

        stat.execute(insertarFila);
        stat.execute(insertarFila2);
        stat.execute(insertarFila3);

        String sql = "SELECT * FROM EMPLEADO";
        ResultSet rd = stat.executeQuery(sql);

        while (rd.next()){
            System.out.println(rd.getInt(1)+" "+rd.getString(2)+" "+rd.getString(3)+" "+rd.getDate(4));
        }
    }
}
