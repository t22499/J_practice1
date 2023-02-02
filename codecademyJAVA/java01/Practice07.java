package codecademyJAVA.java01;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice07 {
    public static void main(String[] args) {
        //选择排序
        int[] arr = {5,4,2,6,2,7};

        for (int i = 0;i < arr.length -1;i++){
            for (int j = i + 1;j < arr.length;j++){
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i =0;i < arr.length;i++){
            System.out.print(arr[i]);
        }



        //冒泡排序
        int[] arr2 = {5,4,2,6,2,7};
        for (int i = 0;i < arr2.length - 1;i++){
            for (int j = 0;j < arr2.length -1 -i;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }


   }
}

