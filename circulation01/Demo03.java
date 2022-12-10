package circulation01;

public class Demo03 {
	public static void main(String[] args) {
		/*
		 * 某人有100000块钱，每经过路口需要缴费。规则如下
		 * 1.当现金大于50000时扣5%
		 * 2.当现金小于等于50000时候，每次交1000
		 * 计算可以通过多少次路口，要求使用while break方式完成
		 */
		
		int money = 100000;
		int time = 0;
		while(true) {
			if(money>50000) {
				money *= 0.95;
				time++;
			}else if(money>=1000) {
				money -= 1000;
			 	time++;
			}else {
				break;
			}
		}
		System.out.println("可以过"+time+"次");
	}
	

}
