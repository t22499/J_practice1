package io;

import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice14 {
    public static void main(String[] args) throws IOException {
        String filePath = "aaa.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),"utf-8"));
        String s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
