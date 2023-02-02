package Collection;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice11 {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("aa"));
        set.add(111);
        set.add(222);
        set.add(333);
        set.add(333);
        set.add(new Person("bb",12));
        System.out.println(set);




    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}