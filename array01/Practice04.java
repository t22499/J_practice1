package array01;

public class Practice04 {
	public static void main(String[] args) {
		//数组排序
				int[] arr = {4,1,5,3,2,9};
			
			for(int i = 0;i<arr.length-1;i++) {
				for(int j = i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}

		
	}

}
