package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread.start();
        thread2.start();


    }
}
class T1 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while (true){
        System.out.println("hello,world" + (++count));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
            if (count == 50){
                break;
            }
        }
    }
}
class T2 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello,world" + (++count));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 50){
                break;
            }
        }
    }
}
