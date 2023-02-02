package thread;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
            Thread.sleep(1000 * 10);
            t.setLoop(false);


    }
}
class T extends Thread{
    private int count = 0;
    private boolean loop = true;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t运行中..." + (++count));

        }
    }

    public void setLoop(boolean loop){
        this.loop = loop;
    }
}
