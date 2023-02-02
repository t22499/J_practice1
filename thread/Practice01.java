package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();//启动线程



    }
}
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true) {

            System.out.println("喵喵,我是小猫咪" + (++times));


           /* try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            if (times == 80){
                break;
            }

        }
    }
}
