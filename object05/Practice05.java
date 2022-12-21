package object05;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        //枚举类的各种方法
        Season2 autumn = Season2.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal()输出的是该枚举对象的次序/编号，从零开始编号
        //AUTUMN枚举对象是第三个，因此输出2
        System.out.println(autumn.ordinal());
        //从反编译可以看出values返回Season2[]
        //含有定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season2 : values){
            System.out.println(season2);
        }


        Season2 season2 = Season2.valueOf("AUTUMN");
        System.out.println("AUTUMN="+season2);

        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));


    }
}
enum Season2 {
    SPPING("春天","温暖"),WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),SUMMER("夏天","炎热");




    private String name;
    private String desc;

    //枚举


    Season2() {
    }

    Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
