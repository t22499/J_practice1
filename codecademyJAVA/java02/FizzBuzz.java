package codecademyJAVA.java02;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1;i < 101;i++){
            if ((i % 3) == 0 && (i % 5) == 0){
                System.out.println("Fizz" + "Buzz");
                continue;
            }else if ((i % 3) == 0){
                System.out.println("Fizz");
            }else if ((i % 5) == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }

        }
    }
}
