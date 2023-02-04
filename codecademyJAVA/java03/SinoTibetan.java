package codecademyJAVA.java03;

/**
 * @avthor 刘添
 * @varsion 1.0
 */
public class SinoTibetan extends Language{
    SinoTibetan(String languageName, int speakers) {
        super(languageName, speakers, "亚洲", "主宾谓结构");
        if (languageName.contains("中国")) {
            this.wordOrder = "主语-动词-对象";
        }
    }


}
