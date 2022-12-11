package object01;

public class Object01 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 10;
		cat1.color = "白色";
		cat1.weight = 10;
		
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";
		cat2.weight = 20;
		
		System.out.println("第一只猫信息"+cat1.name+cat1.age+cat1.name+cat2.weight);
		System.out.println("第二只猫信息"+cat2.name+cat2.age+cat2.name+cat2.weight);
		
	}

}
