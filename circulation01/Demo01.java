package circulation01;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		
		/*
		 * 多重循环练习 统计三个班成绩，每班有5人，求出各班平均分和所有班平均分用键盘录入形式 统计三个班及格人数，每班五人
		 */
		
		//创建Scanner对象
		Scanner myScanner = new Scanner(System.in);
		//累计所有学生的成绩
		double totalScore = 0;
		//及格人数
		int pass = 0;
		for(int i = 1;i <= 3;i++) {
			double sum =0;//一个班级的总分
			int p =0;
			System.out.println("请输入第"+i+"班的");
			for(int j = 1;j <= 5;j++) {
			System.out.println("请输入第"+j+"名学员的成绩");
			double score = myScanner.nextDouble();
			sum += score;
			System.out.println("第"+j+"名学员成绩为"+score);
			if(score>=60) {
				p++;
			}
			}
			//班级平均分
			System.out.println(i+"班"+"sum="+sum+"平均分"+(sum / 5));
			//把sum累积到totalScore
			totalScore += sum;
			pass += p; 
		}
		
		
		System.out.println("三个班平均成绩="+totalScore+"平均分="+totalScore/15);
		System.out.println("三个班及格人数="+pass);
	}

}
