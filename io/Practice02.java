package io;

import org.junit.Test;

import java.io.File;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) {

    }
    @Test
    public void info(){
        File file = new File("aaa.txt");
        System.out.println("文件名=" + file.getName());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件夹父级目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("是不是一个文件=" + file.isFile());
        System.out.println("是不是一个目录=" + file.isDirectory());
    }
}
