package object05;

public class Practice01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.f1();
        System.out.println("Outer01 hashcode="+ outer01);


    }
}
class Outer01{
    private int n1 = 99;
    public void f1(){
        int n1 = 80;
        //创建一个基于类的匿名内部类
        //方法一
        Person p = new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法"+ n1 + " " +
                        Outer01.this.n1);
                System.out.println("Outer01.this hashcode=" + Outer01.this);
            }
        };p.hi();//动态绑定，运行类型是Outer01

         //方法二
         new Person(){
             @Override
             public void ok(String str) {
                 super.ok(str);
             }
         }.ok("jack");//动态绑定，运行类型是Outer01






    }

}
class Person{
    public void hi(){
        System.out.println("Person hi()");
    }
    public void ok(String str){
        System.out.println("Person ok()" + str);
    }
}
