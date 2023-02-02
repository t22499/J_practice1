package io;


import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice12 implements Serializable {
    public static void main(String[] args) throws IOException {
        String filePath = "iii.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(10);
        oos.writeBoolean(true);
        oos.writeDouble(20.2);
//        oos.writeObject(new Dog("大黄",2));
        oos.close();

    }
}


