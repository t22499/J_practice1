package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice07 {
    public static void main(String[] args) throws InterruptedException {
        myDaemonThread myDaemonThread = new myDaemonThread();
        myDaemonThread.setDaemon(true);//守护线程
        myDaemonThread.start();
        for (int i =1;i <= 10;i++){
            System.out.println("main线程");
            Thread.sleep(1000);
        }


    }
}
class myDaemonThread extends Thread{
    @Override
    public void run() {
        while (true){

            System.out.println("子线程");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
