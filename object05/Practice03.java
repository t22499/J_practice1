package object05;

public class Practice03 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });


    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}