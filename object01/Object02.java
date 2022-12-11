package object01;

public class Object02 {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("\n当前这个人信息");
		System.out.println("age=" + person.age +"name=" + person.name + "sal=" + person.sal + "isPass=" + person.isPass);
	}

}
class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
}