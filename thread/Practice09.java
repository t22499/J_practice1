package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice09 {
    public static void main(String[] args) {
        bankCard bankCard = new bankCard();
        Thread thread = new Thread(bankCard);
        Thread thread2 = new Thread(bankCard);
        thread.setName("用户1");
        thread2.setName("用户2");
        thread.start();
        thread2.start();

    }
}
class bankCard implements Runnable{
    int balance = 10000;
    Object ob;
    Boolean b = true;
    public  void bankCard(){
        synchronized (this){
            if (balance == 0) {
                System.out.println("卡里没钱了");
                b = false;
                return;
            }

                balance  -=  1000;
                System.out.println(Thread.currentThread().getName()
                        + "取走了1000，余额还剩 =" + balance);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

        }
    }


    @Override
    public  void run() {
        while (b) {
            bankCard();
        }
    }
}
