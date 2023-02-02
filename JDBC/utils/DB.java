package utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class DB {
    @Test
    public void testQueryMany() throws SQLException {
        //得到连接
        Connection connection = jdbcUTilsByDruid.getConnection();
        //使用DBUtils类接口,先引入DBUtils相关的jar包
        //创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id >= ?";
        List<Actor> list =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
//        queryRunner.query(connection,sql,new ScalarHandler(),1);

        System.out.println("输出集合的信息");
        for (Actor actor : list) {
            System.out.println(actor);
        }
        jdbcUTilsByDruid.close(null,null,connection);


    }
    @Test
    public void testDML() throws SQLException {
        //得到连接
        Connection connection = jdbcUTilsByDruid.getConnection();
        //使用DBUtils类接口,先引入DBUtils相关的jar包
        //创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        String sql = "update actor set name = ? where id = ?";
        int update = queryRunner.update(connection, sql, "张三丰", 1);

        System.out.println(update > 0 ? "执行操作" : "执行没有影响到表");


        jdbcUTilsByDruid.close(null,null,connection);


    }
}
