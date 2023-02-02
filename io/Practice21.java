package io;

import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice21 {
    public static void main(String[] args) throws IOException {
        String s = "";
        BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
        while ((s = br.readLine()) != null){
            System.out.println(s + ".");

        }
    }
}
