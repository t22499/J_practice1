package object01;

public class Object07 {
	public static void main(String[] args) {
		Manager m = new Manager();
		
		m.name = "tom";
		m.id = 9527;
		m.salary = 12000;
		m.bonus = 3000;
		
		System.out.println(m.name + "..." + m.id + "..." + m.salary + "..." + m.bonus); 
		m.work();
	}
}
/*
1.项目经理类Manager 
		属性：
			姓名name
			工号id
			工资salary
			奖金bonus
		行为：
			工作work()
*/

class Manager {
	String name;
	int id;
	double salary;
	double bonus;
	
	public void work() {
		System.out.println("好好工作");
	}
}
