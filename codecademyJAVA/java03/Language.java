package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class Language extends Thread{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;

    protected String wordOrder;

    Language(String langName, int speakers, String regions, String wdOrder) {
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo() {

        System.out.println(this.name  + this.numSpeakers  + this.regionsSpoken );
        System.out.println(  this.wordOrder);

    }

    public static void main(String[] args) {
        Language spanish = new Language("西班牙”", 555000000, "地区:西班牙，拉丁美洲，赤道几内亚", "主语-动词-对象");
        spanish.getInfo();

        Mayan kiche = new Mayan("Ki'che'", 2330000);
        kiche.getInfo();

    }

}
