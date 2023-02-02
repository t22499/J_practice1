package io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice07 {
    public static void main(String[] args) {
        String filePath = "eee.txt";
        FileWriter fileWriter = null;
//        String filePath2 = "aaa.txt";
        char[]c = {'a','牛'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(c,0,c.length);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
