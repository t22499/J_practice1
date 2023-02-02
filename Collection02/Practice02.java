package Collection02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("aa");
        arrayList.add("bb");
        arrayList.add("cc");
        arrayList.remove(0);
        boolean aa = arrayList.contains("aa");
        System.out.println(aa);
        for (Object o : arrayList) {
            System.out.println(o);

        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
class Car{
    private String name;
    private int price;

    public Car() {
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}