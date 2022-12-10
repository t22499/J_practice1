package operator01;

public class Practice07 {
	public static void main(String[] args) {
		int x = 5, y = 5;
		if(x++ == 5 | ++y == 5) {
			x = 11;
		}
		System.out.println("x="+x+"y="+y);
	}

}
