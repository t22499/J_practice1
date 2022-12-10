package operator01;

public class Practice11 {
	public static void main(String[] args) {
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		
		System.out.println("最大数=" + max);
	}

}
