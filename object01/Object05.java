package object01;

public class Object05 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name + "..." + s.age);//null...0
		s.name = "rose";
		s.age = 18;
		System.out.println(s.name + "..." + s.age);//rose...18
		s = new Student();
		System.out.println(s.name + "..." + s.age);//null...0
		s.name = "jack";
		s.age = 20;
		System.out.println(s.name + "..." + s.age);//jack...20
	}
}

class Student {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃肉");
	}
	
	public void study() {
		System.out.println("学习Java");
	}
}
