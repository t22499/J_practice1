package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice07 {
    public static void main(String[] args) {
        Car car = new Car(60);
        car.getAir().flow();
        Car car2 = new Car(-1);
        car2.getAir().flow();
        Car car3 = new Car(20);
        car3.getAir().flow();

    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    //Air成员内部类
    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("温度大于40 空调吹冷气..");
            } else if (temperature < 0) {
                System.out.println("温度小于0 空调吹暖气..");
            } else {
                System.out.println("温度正常，关闭空调..");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
