package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(new Book("红楼梦","曹雪芹",100));
        objects.add(new Book("西游记","吴承恩",10));
        objects.add(new Book("水浒传","施耐庵",9));
        objects.add(new Book("三国演义","罗贯中",80));

        for (Object o : objects) {
            System.out.println(o);

        }
        //冒泡排序
        sort(objects);
        System.out.println("==排序后==");
        for (Object o : objects) {
            System.out.println(o);

        }


    }


    //静态
    //排序
    public static void sort(List list){
        int listSize = list.size();
        for (int i = 0;i < listSize - 1;i++){
            for (int j = 0;j < listSize - 1 - i;j++){
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j + 1,book1);
                }
            }
        }
    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称:" + name + "\t\t价格:" + price + "\t\t作者:" + author;
    }
}
