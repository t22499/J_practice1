package Collection;

import java.util.HashSet;
import java.util.Objects;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice10 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee2("小a",2000,new MyDate(2000,10,10)));
        hashSet.add(new Employee2("小a",2000,new MyDate(2000,10,10)));
        hashSet.add(new Employee2("小b",2000,new MyDate(2001,4,10)));
        System.out.println(hashSet);



    }
}
class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return getYear() == myDate.getYear() && getMonth() == myDate.getMonth() && getDay() == myDate.getDay();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYear(), getMonth(), getDay());
    }
}
class Employee2{
    private String name;
    private int sal;
    private MyDate myDate;

    public Employee2() {
    }

    public Employee2(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public Employee2(String name, int sal, MyDate myDate) {
        this.name = name;
        this.sal = sal;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee2)) return false;
        Employee2 employee2 = (Employee2) o;
        return Objects.equals(getName(), employee2.getName()) && Objects.equals(getMyDate(), employee2.getMyDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMyDate());
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", myDate=" + myDate +
                '}';
    }
}
