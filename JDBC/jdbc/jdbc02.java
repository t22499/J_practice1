package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbc02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver diver = (Driver)clazz.newInstance();

        String url = "jdbc:mysql://localhost:3306/lt_db1";
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","abc123");

        Connection connect = diver.connect(url,info);
        Statement statement = connect.createStatement();
        String sql = "insert into goods values(3,'iphone',3000)";
        int i = statement.executeUpdate(sql);
        System.out.println(i > 0 ? "成功" : "失败");

        connect.close();
        statement.close();


    }
}
