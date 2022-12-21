package object05;

public class Practice02 {
    public static void main(String[] args) {
        //当做实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一副名画");

            }
        });

        f1(new Picture());



    }
    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();

    }
}
//接口
interface IL{
    void show();

}
class Picture implements IL{

    @Override
    public void show() {
        System.out.println("这是一副名画");
    }
}
