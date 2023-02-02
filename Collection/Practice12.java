package Collection;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice12 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1","aa");
        hashMap.put("2","aa");
        hashMap.put("3","bb");
        System.out.println(hashMap);
//        hashMap.remove("1");
//        System.out.println(hashMap);
        Object o = hashMap.get("1");
        System.out.println(o);
        int size = hashMap.size();
        System.out.println(size);
        boolean empty = hashMap.isEmpty();
        System.out.println(empty);
        boolean b = hashMap.containsKey("1");
        System.out.println(b);
        hashMap.clear();
        System.out.println(hashMap);


    }
}
