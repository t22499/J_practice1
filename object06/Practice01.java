package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class practice01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat(100);
        System.out.println(cat);
        System.out.println(cat1);




    }
}
class Cat{
    double price = 10;
     static String color = "white";

    public Cat() {
        this.price = 9;
        color = "red";
    }

    public Cat(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
