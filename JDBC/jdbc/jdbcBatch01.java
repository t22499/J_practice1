package jdbc;

import org.junit.Test;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class jdbcBatch01 {
    public static void main(String[] args) {

    }
    @Test
    public void Batch01() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into t2 vaules(null,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0;i < 5000;i++){
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            //将sql加入批处理
            preparedStatement.addBatch();
            //当有1000条记录时，在批量执行
            if ((i + 1) % 1000 == 0){
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("Batch耗时 = " + (end - start));

        //关闭连接
        JDBCUtils.close(null,preparedStatement,connection);
    }

}
