package io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) {
    }

    @Test
    public void readFile01(){
        int readDate = 0;
        FileInputStream fileInputStream = null;
        String filePath = "aaa.txt";
        try {
             fileInputStream = new FileInputStream(filePath);

            while ((readDate = fileInputStream.read()) != -1){
                System.out.println((char) readDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile02(){
//        int readDate = 0;

        //字节数组
        byte[] bytes = new byte[128];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        String filePath = "aaa.txt";
        try {
            fileInputStream = new FileInputStream(filePath);

            while ((readLen = fileInputStream.read(bytes)) != -1){
                System.out.println(new String(bytes,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
