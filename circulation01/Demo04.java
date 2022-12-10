package circulation01;

import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		int ge = 0;
		int shi = 0;
		int bai = 0;
		int number = 0;
		//999以内水仙花数
		for(int i =100; i<= 999; i++) {
			ge = i/1%10;
			shi = i/10%10;
			bai = i/100%10;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i) {
				System.out.println(i);
				number++;
			}
			
		}
		System.out.println("水仙花数为"+number);
	
	}

}
