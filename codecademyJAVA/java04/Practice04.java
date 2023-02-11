package java4;

import java.util.ArrayList;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice04 {
    public static int getTotal(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(3);
        myArray.add(5);
        myArray.add(6);
        myArray.add(9);

        int total = getTotal(myArray);
        System.out.println(total); // Prints: 23
    }
}
