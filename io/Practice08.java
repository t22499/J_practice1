package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice08 {
    public static void main(String[] args) throws IOException {
        String filePath = "aaa.txt";
        String line = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
//        System.out.println(bufferedReader.readLine());
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
