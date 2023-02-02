package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice08 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复

        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(null);//再次添加 null
        for(int i = 0; i <10;i ++) {
            System.out.println("set=" + set);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();


        }


    }
}
