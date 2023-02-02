package Collection02;

import java.util.ArrayList;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊超千万，数百万印度教信徒赴恒河圣域引起民众担忧"));
        arrayList.add(new News("男子突然想起两个月前钓的鱼还在网兜里，捞起来一看马上放生"));
        int size = arrayList.size();
        for (int i = size - 1;i >= 0;i--){
//            System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitlee()));
        }

    }

    public static String processTitle(String title){
        if (title == null){
            return "";
        }
        if (title.length() > 15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
class News{
    private String titlee;
    private String content;

    public News(String titlee) {
        this.titlee = titlee;
    }

    public String getTitlee() {
        return titlee;
    }

    public void setTitlee(String titlee) {
        this.titlee = titlee;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String   toString() {
        return "News{" +
                "titlee='" + titlee + '\'' +
                '}';
    }
}