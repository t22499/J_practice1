package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice05 {
    public static void main(String[] args) throws Exception {
        T3 t3 = new T3();
        t3.start();

        for (int i = 1;i <= 20;i++){
            Thread.sleep(1000);
            System.out.println("主线程 吃了 "+ i + "包子");
            if (i == 5){
                System.out.println("主线程(小弟)让 子线程(老大)先吃");
                t3.join();

            }
        }


    }
}
class T3 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程(大哥) 吃了" + i + "个包子");

        }
    }

}

