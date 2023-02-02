package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice13 implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "iii.txt";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        ois.readInt();
        ois.readBoolean();
        ois.readDouble();
        Object dog = ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);
        //调用Dog类的方法需要向下转型
        Dog dog2 = (Dog)dog;
        System.out.println(dog2.getAge() + dog2.getName());

        ois.close();
    }
}
