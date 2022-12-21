package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice05 {
    public static void main(String[] args) {

    }
}
class A{
    private final String name = "小王";
    public void f1(){
        System.out.println(name);

        class B{
            private final String name = "小李";
            public void show(){
                System.out.println("内部类="+name+"外部类="+A.this.name);

            }
        }
    }
}