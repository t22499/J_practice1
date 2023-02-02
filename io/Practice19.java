package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice19 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("mysql.properties"));
        //显示k，v值
        properties.list(System.out);
        //根据k获取对应值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名="+user);
        System.out.println("密码="+pwd);

    }
}
