package java4;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice02 {
    public static String reverseString(String text) {
        String reversed = new String("");
        for (int i=0; i < text.length(); i++){
            reversed = text.charAt(i) + reversed;
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str = new String("howdy");
        String reverse = reverseString(str);
        System.out.println(reverse); // Prints: ydwoh
    }

}
