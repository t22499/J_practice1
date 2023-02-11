package java4;

import java.io.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "aaa.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeObject(new Dog(1,"大黄"));


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
        Dog dog =(Dog) ois.readObject();
        System.out.println(dog.getName());
        oos.close();
        ois.close();


    }
}
class Dog implements Serializable{
    private int age;
    private String name;

    public Dog() {
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
