package io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile(){
        String filePath = "bbb.txt";
        FileOutputStream fileOutputStream = null;
        try {
//             fileOutputStream = new FileOutputStream(filePath);
             fileOutputStream = new FileOutputStream(filePath,true);
             //写入
//            fileOutputStream.write('a');
            String str = "ccc";
//            fileOutputStream.write(str.getBytes());

            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
