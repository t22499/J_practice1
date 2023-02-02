package jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class c3p0 {
    @Test
    public void testC3P0_01() throws Exception {
        //创建一个数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        //读取相关的属性值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String  driver = properties.getProperty("driver");

        //设置comboPooledDataSource相关参数
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setJdbcUrl(url);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);

        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);

        //测试效率
        long start = System.currentTimeMillis();
        for (int i =0;i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
//        System.out.println("连接ok");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

    @Test
    public void testC3P0_02() throws Exception {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource("lt_c3p0");
//        Connection connection = comboPooledDataSource.getConnection();

        //测试效率
        long start = System.currentTimeMillis();
        for (int i =0;i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
//        System.out.println("连接ok");
            connection.close();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

//        System.out.println("连接ok");
//        connection.close();


    }
}
