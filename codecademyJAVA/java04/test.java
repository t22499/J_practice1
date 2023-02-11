package java4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        byte[] b = new byte[1024];

        fis = new FileInputStream("TestFile2.txt");
        int read = fis.read(b);
        String s = new String(b, 0, read);
        System.out.println(s);
    }
}
