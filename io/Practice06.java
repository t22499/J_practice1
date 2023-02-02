package io;


import java.io.FileReader;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice06 {
    public static void main(String[] args) {
        String filePath = "aaa.txt";
        FileReader fileReader = null;
        int read = 0;
        char[] c = new char[1024];

        try {
            fileReader = new FileReader(filePath);
            while ((read = fileReader.read(c)) != -1) {
                System.out.println(new String(c,0,read));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
