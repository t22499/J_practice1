package object04.demo02;

public class Practice01 {
    public static void main(String[] args) {

    }
}
abstract class A{
    public int n1 = 10;
    public static String name = "韩顺平教育";
    public void hi(){
        System.out.println("hi");
    }
    abstract public void aaa();
}
class B extends A{

    @Override
    public void aaa() {

    }
}