package Collection;

import java.util.ArrayList;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice05 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //添加1-10
        for (int i = 1;i <= 10;i++){
            list.add(i);
        }
        //添加11-15
        for (int i = 11;i <= 15;i++){
            list.add(i);
        }
        list.add(100);
        list.add(200);
    }
}
