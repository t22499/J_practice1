package io;

import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice10 {
    public static void main(String[] args) throws IOException {
        String filePath = "aaa.txt";
        String filePath2 = "ggg.txt";
        String str = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2));
        while ((str = bufferedReader.readLine()) != null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
