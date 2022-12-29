package Exception;

import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("0");
        }
    }


}

