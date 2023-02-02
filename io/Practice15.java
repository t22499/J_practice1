package io;

import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice15 {
    public static void main(String[] args) throws IOException {
        String filePath = "lll.txt";
        String s = "小王";
        String s2 = "小李";
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath),"utf-8"));
        bw.write(s);
        bw.newLine();
        bw.write(s2);
        bw.close();
    }
}
