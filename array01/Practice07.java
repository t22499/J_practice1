package array01;

public class Practice07 {
	public static void main(String[] args) {
		System.out.println(getSum(1,2,3,4));
		
		}	
		public static int getSum(int...i) {
			int Sum = 0;
			for(int a:i) {
				Sum = Sum + a;
			}
		 return Sum;
		
	}

}
