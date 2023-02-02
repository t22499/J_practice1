package Collection02;

import java.util.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("tom",12));
        students.add(new Student("jack",18));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next);
        }

        for (Student s : students) {
            System.out.println(s);
        }

        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("1",new Student("tom",18));
        hashMap.put("2",new Student("jack",20));
        hashMap.put("3",new Student("rose",25));

        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Student> entry = iterator1.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}