package object05;

import com.sun.org.apache.bcel.internal.generic.NEW;
/**
 * @avthor 刘添
 * @varsion 1.0
 */

public class Practice06 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week week : values){
            System.out.println(week);
        }

    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二")
    ,WEDNESDAY("星期三"),THURSDAY("星期四")
    ,FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");

    private String name;

    Week() {
    }

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}