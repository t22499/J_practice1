package Collection;

import javax.swing.*;
import java.util.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice13 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1","aa");
        hashMap.put("2","bb");
        hashMap.put("3","cc");

        //遍历
        //根据key获取value
        Set keyset = hashMap.keySet();
        for (Object key : keyset) {
            System.out.println(key + " " + hashMap.get(key));
        }
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key + " " + hashMap.get(key));
        }


        //获取value
        Collection values = hashMap.values();
        for (Object value : values) {
            System.out.println(value);
            
        }

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        //通过EntrySet获取k-v
        Set set = hashMap.entrySet();
        for (Object entry : set) {
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey() + " " +m.getValue());
            
        }

        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()){
            Object entry = iterator2.next();
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey()+ " " + m.getValue());
        }


    }
}
