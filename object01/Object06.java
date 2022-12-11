package object01;

public class Object06 {
	public static void main(String[] args) {
		Pig p1 = new Pig();
		System.out.println(p1.name + "..." + p1.age);
		p1.name = "tom";
		p1.age = 18;
		System.out.println(p1.name + "..." + p1.age);
		p1.eat();
		p1.gong();
		
		Pig p2 = new Pig();
		System.out.println(p2.name + "..." + p2.age);
		p2.name = "jerry";
		p2.age = 19;
		System.out.println(p2.name + "..." + p2.age);
		p2.eat();
		p2.gong();
	}
}

class Pig {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃");
	}

	public void gong() {
		System.out.println("拱");
	}
}