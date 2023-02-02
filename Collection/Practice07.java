package Collection;

import java.util.LinkedList;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice07 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        //演示删除
       /* linkedList.remove(2);
        System.out.println(linkedList);*/

        //修改
        linkedList.set(1,999);
        System.out.println(linkedList);

        //得到某个节点对象
        System.out.println(linkedList.get(1));


        //普通遍历
        for (int i = 0;i < linkedList.size();i++){
            System.out.print(linkedList.get(i)+ " ");
        }
        System.out.println();




    }
}
