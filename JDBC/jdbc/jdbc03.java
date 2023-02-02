package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbc03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //0.导入jar包

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lt_db1", "root", "123");

        //3.获取执行sql语句的对象
        Statement stat = conn.createStatement();

        //4.执行sql语句
        int i = stat.executeUpdate("insert into goods values(1,'tom', 18)");
        System.out.println(i);

        //5.释放资源
        stat.close();
        conn.close();
    }
}
