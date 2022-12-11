package object01;

public class Object04 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		System.out.println(b1.name + "..." + b1.age);//null...0
		b1.name = "tony";
		b1.age = 20;
		System.out.println(b1.name + "..." + b1.age);//tony...20
		
		Bird b2 = b1;
		System.out.println(b2.name + "..." + b2.age);//tony...20
		b2.name = "mary";
		b2.age = 17;
		System.out.println(b2.name + "..." + b2.age);//mary...17
		
		System.out.println(b1.name + "..." + b1.age);//mary...17
	}
}

class Bird {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃虫");
	}
	
	public void fly() {
		System.out.println("横着飞");
	}
}
