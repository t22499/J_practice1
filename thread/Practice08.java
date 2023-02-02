package thread;

import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice08 {
    public static void main(String[] args) {
        homeWork homeWork = new homeWork();
        Thread thread = new Thread(homeWork);
        thread.setDaemon(true);//设置为守护线程
        thread.start();
        Scanner scanner = new Scanner(System.in);
        String s3 = "q";
        while (true){

            String s = scanner.nextLine();
            String s2 = (String)s;
            if (s2.equals(s3)){
                break;
            }
            System.out.println(s);
        }



    }
}
class homeWork implements Runnable{

    @Override
    public void run() {
        for (;;){
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
