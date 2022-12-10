package circulation01;

public class Demo05 {
	public static void main(String[] args) {
		
		//100以内不能被整除的数，每五个一行
		int count = 0;
		for(int i=1;i<=100;i++) {
			if(i%5 != 0) {
				count++;
				System.out.print(i+" ");
				if(count % 5 ==0) {
				System.out.println();
				}
			}
		}
	}

}
