package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("mysql.properties"));
        String line = "";
        while((line = br.readLine()) != null){
            String[] split = line.split("=");
            if ("ip".equals(split)) {
                System.out.println(split[0] + "值是：" + split[1]);
            }
        }
        br.close();

    }
}
