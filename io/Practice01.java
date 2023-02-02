package io;


import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01 {
    public static void main(String[] args) {


    }
    //方式1
    @Test
    public  void create01()  {
        String filePath = "aaa.txt";
        File file = new File(filePath);


        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //方式2
    /*public  void create02()  {
        File file = new File("C:\\");
        String fileName = "bbb.txt";
        File file1 = new File(file, fileName);
        try {
            file1.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }*/


}
