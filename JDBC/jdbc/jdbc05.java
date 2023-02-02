package jdbc;

import java.sql.*;
import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbc05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员的名字:");
        String name = scanner.nextLine();
        System.out.println("请输入管理员密码:");
        String pwd = scanner.nextLine();

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lt_db1", "root", "123");

        String sql = "select name ,pwd from t1 where name = ? and pwd = ?";
        //3.获取执行sql语句的对象
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1,name);
        preparedStatement.setString(2,pwd);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            System.out.println("恭喜登录成功");
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getInt(2));
        }else {
            System.out.println("对不起登录失败");
        }


        //4.执行sql语句
//        int i = stat.executeUpdate("insert into t1 values('tom', 123)");
//        System.out.println(i);

        //5.释放资源
        resultSet.close();
        preparedStatement.close();
        conn.close();

    }
}
