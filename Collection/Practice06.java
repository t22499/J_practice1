package Collection;


/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice06 {
    public static void main(String[] args) {
        //模拟双向列表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("老韩");

        //连接三个结点，形成双向链表
        jack.next = tom;
        tom.next = hsp;

        hsp.pre = tom;
        tom.pre = jack;


        //Node first = jack;
        Node first = jack;
        Node last = hsp;
        System.out.println("===从头到尾进行遍历===");
        while (true) {
            if(first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;

        }
        System.out.println("===从尾到头进行遍历===");

        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;



        }


    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}
