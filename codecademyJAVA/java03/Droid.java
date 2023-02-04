package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Droid {
    int batteryLevel ;
    String name;


    public  Droid(String name,int batteryLevel){
        this.batteryLevel = batteryLevel;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "batteryLevel=" + batteryLevel +
                ", name='" + name + '\'' +
                '}';
    }

    public void performTask(String task){
        System.out.println(this.name + "正在执行"+ task + "任务" + "电量" + batteryLevel);

    }
}
