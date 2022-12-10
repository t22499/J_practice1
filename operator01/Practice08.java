package operator01;

public class Practice08 {
	public static void main(String[] args) {
		int x = 5, y = 5;
		if(x++ == 5 || ++y == 5) {
			x = 11;
		}
		System.out.println("x="+x+"y="+y);
	}

}
