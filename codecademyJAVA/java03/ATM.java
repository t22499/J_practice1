package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class ATM {
    public static int totalMoney = 0;
    public static int numATMs = 0;

    public int money;

    public ATM(int inputMoney){
        this.money = inputMoney;
        numATMs += 1;
        totalMoney += inputMoney;
    }

    public void withdrawMoney(int amountToWithdraw){
        if(amountToWithdraw <= this.money){
            this.money -= amountToWithdraw;
            totalMoney -= amountToWithdraw;
        }
    }

    public static void averageMoney(){
        System.out.println(totalMoney / numATMs);
    }

    public static void main(String[] args){

        System.out.println("atm总数: " + ATM.numATMs);
        ATM firstATM = new ATM(1000);
        ATM secondATM = new ATM(500);
        System.out.println("atm总数: " + ATM.numATMs);

        System.out.println("atm总额: " + ATM.totalMoney);
        firstATM.withdrawMoney(500);
        secondATM.withdrawMoney(200);
        System.out.println("atm总额: " + ATM.totalMoney);

        ATM.averageMoney();
    }
}
