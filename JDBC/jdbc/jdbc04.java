package jdbc;

import java.sql.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbc04 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        String url = "jdbc:mysql://localhost:3306/lt_db1";
        String user = "root";
        String password = "hsp";

        DriverManager.registerDriver(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("");

        statement.close();
        connection.close();

    }
}
