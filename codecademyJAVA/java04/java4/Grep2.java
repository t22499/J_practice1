package java4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Grep2 {
    public static void main(String[] args) throws IOException {
        String s = TextFiles();
        Pattern pattern = Pattern.compile("[A-Z]+[a-z]*\\d\\.(txt)");
//        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }


    public static String TextFiles () throws IOException {
        String fName;
        File f;
        FileInputStream fis = null;
        byte[] b = new byte[1024];
        String s = null;


        for (int fileNumber = 1; fileNumber <= 5; fileNumber++) {
            fName = "TestFile" + fileNumber + ".txt";
            try {
                f = new File(fName);
                fis = new FileInputStream(f);
                int read = fis.read(b);
                s = new String(b,0,read);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return s;
    }
}
