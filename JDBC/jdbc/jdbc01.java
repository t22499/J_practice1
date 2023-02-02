package jdbc;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbc01 {
    public static void main(String[] args) throws SQLException {

        Driver driver = new Driver();

        String url  = "jdbc:mysql://localhost:3306/lt_db1";

        Properties properties = new Properties();

        properties.setProperty("user","root");
        properties.setProperty("password","123");

        Connection connect = driver.connect(url, properties);
        Statement statement = connect.createStatement();

        int i = statement.executeUpdate("insert into goods values(3,'iphone',3000)");
        System.out.println(i > 0 ? "成功" : "失败");

        connect.close();
        statement.close();


    }
}
