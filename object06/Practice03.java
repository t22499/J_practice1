package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class practice03 {
    public static void main(String[] args) {
        Animal cat = new Cat2();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();


    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat2 extends Animal{

    @Override
    public void shout() {
        System.out.println("猫会叫");
    }
}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("狗会叫");
    }
}