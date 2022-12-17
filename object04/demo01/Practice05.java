package object04.demo01;

public class Practice05 {
    public static void main(String[] args) {
        //单例设计模式
        //懒汉式
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);


    }

}
class Cat{
    private String name;
    private static Cat cat;
    //步骤
    //1仍然构造器私有化
    //2定义一个static静态属性对象
    //3提供一个public的static方法，可以返回一个Cat对象
    //4懒汉式，只有当用户使用getInstance时，才返回cat对象，后面再次调用时，会返回上次创建的cat对象
    //从而保证单例
    private Cat(String name){
        this.name = name;
        System.out.println("构造器被调用");
    }
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}