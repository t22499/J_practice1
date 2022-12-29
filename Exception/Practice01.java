package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while(true){
            System.out.println("请输入一个整数");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            }catch(Exception e){
                System.out.println("你输入的不是一个整数：");
            }
        }
        System.out.println("你输入的值是=" + num);




    }

}
