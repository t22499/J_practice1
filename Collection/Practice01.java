package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01 {
    public static void main(String[] args) {
        ArrayList<Object> objects1 = new ArrayList<>();
        objects1.add("aaa");
        objects1.add("bbb");
        objects1.add("ccc");
        for (Object ob : objects1){
            System.out.print(ob);
        }
        System.out.println("");
        objects1.remove(1);
        for (Object ob : objects1){
            System.out.print(ob.toString());
        }
        System.out.println("");

        boolean aaa = objects1.contains("aaa");
        System.out.println(aaa);
        int size = objects1.size();
        System.out.println(size);
        objects1.clear();
        boolean empty = objects1.isEmpty();
        System.out.println(empty);



    }
}
