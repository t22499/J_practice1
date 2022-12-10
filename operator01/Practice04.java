package operator01;

public class Practice04 {
	public static void main(String[] args) {
		System.out.println(60 > 20);
		System.out.println(!(60 > 20));
		
		//异或，当a与b的结果不同时结果为true，否则为false
		boolean b = (10 > 1) ^ (3 > 5);
		System.out.println("b="+b);
	}

}
