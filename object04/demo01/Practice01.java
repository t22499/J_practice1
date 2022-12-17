package object04.demo01;

public class Practice01 {
    public static void main(String[] args) {
        Stu stu1 = new Stu();
        stu1.payFee(100);
        Stu stu2 = new Stu();
        stu2.payFee(200);

        Stu.showFee();

        System.out.println(MyTools.calSum(10,30));

        /*for(int i = 0;i < args.length;i++){
            System.out.println("args["+ i + "]" + args[i]);
        }*/


    }

}
class MyTools{
    public static double calSum(double n1,double n2){
        return n1 + n2;
    }
}
class Stu {
    private String name;//普通成员

//定义一个静态变量，来累积学生的学费

    private static double fee = 0;
    public Stu(){

    }
    public Stu(String name) {
        this.name = name;
    }
//说明

//1. 当方法使用了 static 修饰后，该方法就是静态方法

//2. 静态方法就可以访问静态属性/变量

    public  void payFee(double fee) {
        Stu.fee += fee;//累积到

    }
    public static void showFee() {
        System.out.println("总学费有:" + Stu.fee);
    }
}
