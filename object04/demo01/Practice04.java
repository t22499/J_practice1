package object04.demo01;

public class Practice04 {
    public static void main(String[] args) {
        //单例设计模式
        //饿汉式
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance.toString());



    }

}
class GirlFriend{
    private String name;
    //为了能够在静态方法中，返回 gf对象，需要将其修饰为static
    private static GirlFriend gf = new GirlFriend("小红红");
    //如何保障我们只创建一个GirlFriend对象
    //步骤
    //1将构造器私有
    //2在类的内部直接创建
    //3提供一个公共的static方法，返回 gf对象
    private GirlFriend(String name){
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}