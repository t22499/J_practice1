package Collection02;


import java.util.ArrayList;
import java.util.Comparator;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice05 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom","10000",new MyDate(2000,12,12)));
        employees.add(new Employee("jack","30000",new MyDate(1998,1,10)));
        employees.add(new Employee("rose","8000",new MyDate(2001,2,10)));
        System.out.println("Employee=" + employees);

        //排序
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee em1, Employee em2) {
                //比较name
                int i = em1.getName().compareTo(em2.getName());
                if (i != 0) {
                    return i;
                }
                return em1.getBirthday().compareTo(em2.getBirthday());


            }

        });
        System.out.println(employees);


    }
}
class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int year = this.year - o.getYear();
        if (year != 0){
            return year;
        }
        int month = this.month - o.getMonth();
        if (month != 0){
            return month;
        }
        return this.day - o.getDay();
    }
}
class Employee{
    private String name;
    private String sal;
    private MyDate birthday;

    public Employee(String name, String sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
