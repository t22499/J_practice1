package object04.demo02;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("普通员工" + getName() + "工作中...");
    }
}
