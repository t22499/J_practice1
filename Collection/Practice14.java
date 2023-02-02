package Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice14 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,new Emp(1,10000,"jack"));
        hashMap.put(2,new Emp(2,19000,"rose"));
        hashMap.put(3,new Emp(3,20000,"tom"));

        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            Emp emp = (Emp)hashMap.get(key);
            if (emp.getSel() > 18000){
//                System.out.println(emp);
            }
        }


        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            Emp emp = (Emp)entry.getValue();
            if (emp.getSel() > 18000){
                System.out.println(emp);
            }
        }


    }
}
class Emp{
    private int id;
    private double sel;
    private String name;

    public Emp() {
    }

    public Emp(int id, double sel, String name) {
        this.id = id;
        this.sel = sel;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSel() {
        return sel;
    }

    public void setSel(double sel) {
        this.sel = sel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", sel=" + sel +
                ", name='" + name + '\'' +
                '}';
    }
}
