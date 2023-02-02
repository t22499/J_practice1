package io;

import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice11 {
    public static void main(String[] args) throws IOException {
        String filePath = "aaa.txt";
        String filePath2 = "hhh.txt";
        int read = 0;
        byte[] bytes = new byte[1024];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath2));
        while ((read = bufferedInputStream.read(bytes)) != -1){
//            System.out.println(new String(bytes,0,read));
            bufferedOutputStream.write(bytes,0,read);

        }
        if (bufferedInputStream != null){
            bufferedInputStream.close();
        }
        if (bufferedOutputStream != null){
            bufferedOutputStream.close();
        }


    }
}
