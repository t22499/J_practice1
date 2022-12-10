package array01;

public class Practice06 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = new int[a.length*2];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int j =0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		
	}

}
