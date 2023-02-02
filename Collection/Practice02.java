package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("aaa");
        objects.add("bbb");
        objects.add("ccc");
        Iterator<Object> iterator = objects.iterator();
        /*while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        //快捷键itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            
        }
        //快捷键查询ctrl+j

        for (Object o : objects) {

        }


    }
}
