package object02;

public class Practice03 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1,2,55};
		Object res = a01.max(arr);
		if(res != null) {
			System.out.println("arr的最大值="+res);
		}else {
			System.out.println("arr的输入有误");
		}
		
	
	}

}
class A01{
	public Object max(double[] arr) {
		if(arr != null && arr.length > 0) {
			
			
		double max = arr[0];
		for(int i = 1; i < arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	
	}else {
		return null;
	}
		
	}
}
