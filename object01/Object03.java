package object01;

public class Object03 {
	public static void main(String[] args) {
		//创建一条狗
		Dog dog = new Dog();
		
		System.out.println(dog.name + "..." + dog.age);//null...0
		
		//给狗的属性赋值
		dog.name = "tom";
		dog.age = 18;
		
		System.out.println(dog.name + "..." + dog.age);//tom...18
		
		//调用狗的方法
		dog.eat();
		dog.sleep();
	}
}

class Dog {
	String name;
	int age;
	
	public void eat() {
		System.out.println("吃骨头");
	}
	
	public void sleep() {
		System.out.println("趴着睡");
	}
}
