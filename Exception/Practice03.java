package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/aaa");
    }
}

