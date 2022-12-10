package array01;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		
		//基本查找
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个数字");
		int num = sc.nextInt();
		int[] arr = {12, 4, 13, 10, 1};
		boolean b = false;//false代表没找到true代表找到了
		int index = -1;//找到了就输出那个数，没找到就是-1
		for(int i = 0;i< arr.length;i++) {
			if(arr[i] == num) {
			b = true;
			index = arr[i];
			  break;
			}
		}
			if(b) {
		    System.out.println("找到了");
			}else {
			System.out.println("没找到");
		    }
		    System.out.println(index);

		
	
	}

}
