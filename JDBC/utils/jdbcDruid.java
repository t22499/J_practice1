package utils;


import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author 刘添
 * @version 1.0
 * 该类演示如何使用JDBCUtils工具类，完成dml 和 select
 */
public class jdbcDruid {
    @Test
    public static ArrayList<Actor> getTestSelect() {
        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "select * from actor";
        //String sql = "select * from actor where id = ?";
        PreparedStatement preparedStatement = null;
        ResultSet set = null;
        ArrayList<Actor> list = new ArrayList<>();//存放Actor对象
        //把得到的ResultSet的记录封装到Actor对象，放入到list集合



        //3. 创建PreparedStatement 对象
        try {
            connection = jdbcUTilsByDruid.getConnection();
//            System.out.println(connection.getClass()); //com.mysql.jdbc.JDBC4Connection
            preparedStatement = connection.prepareStatement(sql);
           // preparedStatement.setInt(1, 5);//给?号赋值
            //执行, 得到结果集
            set = preparedStatement.executeQuery();
            //遍历该结果集
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("name");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
               // System.out.println(id + "\t" + name + "\t" + sex + "\t" + borndate + "\t" + phone);
                list.add(new Actor(id,name,sex,borndate,phone));
            }
            System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            jdbcUTilsByDruid.close(set, preparedStatement, connection);
        }
        return list;

    }

    @Test
    public void testDML() {//insert , update, delete

        //1. 得到连接
        Connection connection = null;
        //2. 组织一个sql
        String sql = "update actor set name = ? where id = ?";
        // 测试 delete 和 insert ,自己玩.
        PreparedStatement preparedStatement = null;
        //3. 创建PreparedStatement 对象
        try {
            connection = JDBCUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            //给占位符赋值
            preparedStatement.setString(1, "周星驰");
            preparedStatement.setInt(2, 4);
            //执行
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
