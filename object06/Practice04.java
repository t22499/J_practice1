package object06;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;

            }
        },10,8);


    }
}
interface ICalculate{
    public double work(double n1, double n2);
}
class CellPhone {
    public void testWork(ICalculate iCalculate,double n1,double n2){
        double result = iCalculate.work(n1,n2);
        System.out.println("计算后的结果是=" + result);
    }


}