package java4;

import java.io.File;
import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Grep {
    public static void main(String[] args) {
       String fileName = null;
        File f;
        Scanner s;
       for (int fileNumber = 1;fileNumber <= 5;fileNumber++){
           fileName = "TestFile" + fileNumber + ".txt";

           try {
               f = new File(fileName);

           } catch (Exception e) {
               System.out.println("没找到文件");
               throw new RuntimeException(e);
           }
       }


    }
}
