package Collection;

import java.util.*;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice16 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });

        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("Tank");
        System.out.println(treeSet);
    }
}
