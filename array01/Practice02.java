package array01;

public class Practice02 {
	public static void main(String[] args) {
		//求最值
		//方法1：
		int[] arr = {1,5,6,4,8};
		int max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		
		/*	方法2：
		int[] arr = {1,5,6,4,8};
		int max = 0;
		for(int i =1;i < arr.length;i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		System.out.println(arr[max]);*/
		
	}

}
