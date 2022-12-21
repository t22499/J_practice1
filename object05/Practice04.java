package object05;

public class Practice04 {
    public static void main(String[] args) {
        /*System.out.println(Season.SPPING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);*/
        /*Season sp = Season.SPPING;
        System.out.println(sp);*/


        System.out.println(Season2.SPPING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.WINTER);




    }
}
enum Season{
   /* SPPING("春天","温暖"),WINTER("冬天","寒冷"),
    AUTUMN("秋天","凉爽"),SUMMER("夏天","炎热");*/

    SPPING("春天","温暖"){
      public  void a(){
          System.out.println("春天a");
      }
    },SUMMER("夏天","炎热"){
        public void b(){
            System.out.println("夏天b");
        }
    },AUTUMN("秋天","凉爽"){
        public void c(){
            System.out.println("秋天c");
        }
    },WINTER("冬天","寒冷"){
        public void d(){
            System.out.println("冬天d");
        }
    };


    private String name;
    private String desc;

    //枚举


    Season() {
    }

    Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
