package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice20 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("charset","utf-8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","888888");

        properties.store(new FileOutputStream("mysql2.properties"),null);
        System.out.println("保存配置文件成功");



    }
}
