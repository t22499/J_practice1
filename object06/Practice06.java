package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice06 {
    public static void main(String[] args) {
        Person ts = new Person("唐僧", new Horse());
        ts.common();
        ts.passRiver();
        ts.Volcanoland();


    }
}
interface Vehicles{
    public void work();
}
class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("一般情况骑马");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("过河需要坐船");

    }
}
class Aircraft implements Vehicles{

    @Override
    public void work() {
        System.out.println("过火焰山要坐飞机");

    }
}
class VehiclesFactory{
     private static Horse horse = new Horse();
    //创建交通工具工厂类，有两个方法获得交通工具Horse和Boat
    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }

    public static Aircraft getAircraft(){
        return new Aircraft();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver(){
        //得到船
        /*Boat boat = VehiclesFactory.getBoat();
        boat.work();*/
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();

    }

    public void common(){
        //得到马
        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public void Volcanoland(){
        if(!(vehicles instanceof Aircraft)){
            vehicles = VehiclesFactory.getAircraft();
        }
        vehicles.work();
    }
}