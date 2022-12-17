package object04.demo01;

public class Practice03 {
    public static void main(String[] args) {
        BB a = new BB();



    }

}
class AA{
    private static int n1 = getN1();
    static {
        System.out.println("A静态代码块01");
    }

    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
    public AA(){
        System.out.println("aa");
    }
}
class BB extends AA{
    private static int n2 = getN2();
    static {
        System.out.println("b静态代码块01");
    }
    public BB(){

    }
    public static int getN2(){
        System.out.println("getN1被调用");
        return 100;
    }

}
