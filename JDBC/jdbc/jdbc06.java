package jdbc;

import java.sql.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbc06 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员的名字:");
        String name = scanner.nextLine();
        System.out.println("请输入管理员密码:");
        String pwd = scanner.nextLine();*/

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lt_db1", "root", "123");

//        String sql = "select name ,pwd from t1 where name = ? and pwd = ?";
        String sql = "insert into t1 values(?,?)";
        //3.获取执行sql语句的对象
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

       /* preparedStatement.setString(1,name);
        preparedStatement.setString(2,pwd);*/
        preparedStatement.setString(1,"jack");
        preparedStatement.setString(2,"123");

        int i = preparedStatement.executeUpdate();

        System.out.println(i > 0 ? "登录成功":"登录失败");

      /*  ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            System.out.println("恭喜登录成功");
            System.out.println();
        }else {
            System.out.println("对不起登录失败");
        }*/



        //5.释放资源
//        resultSet.close();
        preparedStatement.close();
        conn.close();
    }
}
