package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice17 {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("jjj.txt"));
        printWriter.print("hi,北京你好");
        printWriter.close();
    }
}
