package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Practice03 {
    public static void main(String[] args) {
        test1(100);


    }
        public static void test1(int n){
        int num=0;
        int j;
        boolean sgin;
        for (int i = 2; i <= n; i++) {

            if(i % 2 == 0 && i != 2  )  continue; //偶数和1排除

            sgin = true;
            for (j = 2; j <= i/2 ; j++) {
                if (i % j == 0) {
                    sgin= false;
                    break;
                }
            }

            //打印
            if (sgin) {
                num++;
                //System.out.println(""+i);
            }
        }
        System.out.println(n+"以内的素数有"+num+"个");
        System.out.println("");


    }
}
