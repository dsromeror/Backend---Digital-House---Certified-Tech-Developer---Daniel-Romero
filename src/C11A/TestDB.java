package C11A;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:h2:"+"./Database/my","sa","myPassword");
        System.out.println("Database created");
        Statement stat = connection.createStatement();
        System.out.println("Database conected");

        String createTable = "DROP TABLE IF EXISTS TEST; CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        stat.execute(createTable);

        String insertarFila = "INSERT INTO TEST VALUES(1, 'HOLA')";
        String insertarFila2 = "INSERT INTO TEST VALUES(2, 'CHAO')";

        stat.execute(insertarFila);
        stat.execute(insertarFila2);

        String sql = "SELECT * FROM TEST";
        ResultSet rd = stat.executeQuery(sql);

        while (rd.next()){
            System.out.println(rd.getInt(1)+rd.getString(2));
        }

    }
}
