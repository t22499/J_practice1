package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice09 {
    public static void main(String[] args) throws IOException {
        String filePath = "fff.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("hello");
        bufferedWriter.newLine();
        bufferedWriter.write("aaaa");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
