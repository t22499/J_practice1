package object02;

public class Practice04 {
	public static void main(String[] args) {
		HspMethod2 h1 = new HspMethod2();
		System.out.println(h1.showScore("tom", 10));
		System.out.println(h1.showScore("tom", 10,15,60,11.5,20));
	}

}
class HspMethod2{
	public String showScore(String name,double...scores) {
		double totalScore = 0;
		for(int i = 0;i < scores.length;i++) {
			totalScore += scores[i];
		}
		return name + " " + scores.length + "课的总成绩为=" + totalScore;
	}
}