package Collection02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",1200);
        Set keySet = hashMap.keySet();//获取所有key值
        for (Object key : keySet) {
            hashMap.put(key,(Integer)hashMap.get(key) + 100);

        }
        System.out.println(hashMap);
        Set keySet1 = hashMap.keySet();
        Iterator iterator = keySet1.iterator();
        while(iterator.hasNext()){
             Object key = iterator.next();
            System.out.println(key + " " + hashMap.get(key));
        }

    }
}
