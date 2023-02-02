package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        System.out.println(list.get(1));
        System.out.println(list.indexOf("aaa"));
        System.out.println(list.lastIndexOf("aaa"));
        System.out.println(list);
        list.set(4,"eee");
        System.out.println(list);



    }
}
