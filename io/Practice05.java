package io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice05 {
    public static void main(String[] args) {

    }
    @Test
    public void File01(){
        String srcFilePath = "bbb.txt";
        String destFilePath = "ddd.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        int fileRead = 0;
        byte[]bytes = new byte[128];

        try {
             fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            //输入流
            while ((fileRead = fileInputStream.read(bytes)) != -1){
//                System.out.println(new String(bytes,0,fileRead));
                fileOutputStream.write(bytes,0,fileRead);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }
}
