package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread thread = new Thread(sellTicket);
        thread.start();
        Thread thread2 = new Thread(sellTicket);
        thread2.start();
        Thread thread3 = new Thread(sellTicket);
        thread3.start();

    }
}
class SellTicket implements Runnable{
    private boolean loop = true;
    int tickets = 100;

    public synchronized void m(){

            if (tickets <= 0){
                System.out.println("售票结束");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "卖了一张票，剩余票数" + (--tickets));
    }

    @Override
    public  void run() {
        while(loop) {
            m();
        }
    }
}
