package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Mayan extends Language {
    Mayan(String languageName, int speakers) {
        super(languageName, speakers, "区域:中美洲", "谓宾主结构");
    }
    @Override
    public void getInfo() {

        System.out.println(this.name + " 是由 " + this.numSpeakers + " 人主要在” " + this.regionsSpoken + ".");
        System.out.println("语言遵循词序: " + this.wordOrder);
        System.out.println("有趣的事实: " + this.name + " 是一种作格语言");

    }
}
