package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class practice02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());



    }
}
class Frock{
    private static int currentNum = 1000000;
    private int serialNumber;

    public int getSerialNumber(){
        return serialNumber;
    }
    public Frock(){
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }
}
