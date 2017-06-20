package cn.circle.demo;


public class WhileDemo04 {
	/**
	 * 2012年培养学员25万人，每年增长25%。
	 * 请问按此增长速度
	 * 到哪一年培训学员任务将到达100万人？
	 * @param args
	 */
 public static void main(String[] args) {
	int year = 2012;
	double person = 25;
	while (person <= 100) {
		person *= (1 + 0.25); // person*=(1+0.25);
		year++;
	}
	System.out.println(year+"培训学员人数将达到100万人");
}
}
