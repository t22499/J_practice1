package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice17 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tom");
        arrayList.add("smith");
        arrayList.add("king");
        arrayList.add("milan");

        Collections.reverse(arrayList);//反转
        System.out.println(arrayList);
        Collections.shuffle(arrayList);//随机排序
        System.out.println(arrayList);
        Collections.sort(arrayList);//根据元素自然排序
        System.out.println(arrayList);//根据Compare排序
        Collections.sort(arrayList, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        System.out.println(arrayList);

        Collections.swap(arrayList,0,1);
        System.out.println(arrayList);
        //
        Comparable max = Collections.max(arrayList);//自然排序，返回最大
        System.out.println(max);

        Object max1 = Collections.max(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
            }
        });
        System.out.println(max1);

        Comparable min = Collections.min(arrayList);//自然排序，返回最小
        System.out.println(min);

        int frequency = Collections.frequency(arrayList,"tom");
        System.out.println(frequency);

        ArrayList arrayList1 = new ArrayList();
        for (int i = 0;i < arrayList.size();i++){
            arrayList1.add("");
        }
        Collections.copy(arrayList1,arrayList);//复制(必须大小一致否则报错)
        System.out.println(arrayList1);

        Collections.replaceAll(arrayList,"tom","汤姆");
        System.out.println(arrayList);


    }
}
