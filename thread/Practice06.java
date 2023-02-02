package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice06 {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        Thread thread = new Thread(t4);
//        Thread thread = new Thread(new T4());
        for (int i = 1;i <= 10;i++){
            Thread.sleep(1000);
            System.out.println("hi" + i);
            if (i == 5){
                thread.start();
                thread.join();


            }

        }


    }
}
class T4 implements Runnable{
    private int count = 0;

    @Override
    public void run() {
        while (true){
            System.out.println("子 =" + "hello" + (++count));
            try {
                Thread.sleep(1000 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }

        }
    }
}
