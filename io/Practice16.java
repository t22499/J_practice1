package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice16 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out = System.out;
        out.print("hello");
        out.close();
        System.setOut(new PrintStream("b.txt"));
        System.out.println("hello,韩顺平教育");
    }
}
