package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class DNA {
    public static void main(String[] args) {
        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna1;
        String a = "aaa";
        System.out.println(dna.length());
        int start = dna.indexOf("ATG");
        int stop = dna.lastIndexOf("TGA");
        System.out.println(a.toUpperCase());

        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {

            System.out.println("满足条件");
            String substring = dna.substring(start, stop + 3);
            System.out.println(substring);

        }else {
            System.out.println("没有");
        }



    }
}
