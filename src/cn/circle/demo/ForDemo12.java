package cn.circle.demo;

import java.util.Scanner;

public class ForDemo12 {

	/**
	 * 循环录入Java课的学生成绩
	 * 统计分数大于等于80份的学生比例
	 * 
	 * continue：代表的是：结束本次循环！继续下次循环！ 之后的代码不会执行！
	 * 跳出循环体了吗？？没有跳出！代表 循环继续！
	 * 
	 * break：跳出当前整个循环体！
	 * 
	 * return：跳出当前方法，可以带有返回值！
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 定义变量，保存分数大于80的人数
		int sum = 0;
		System.out.println("请输入班级的人数：");
		int count = scanner.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.println("请输入第"+i+"名同学的成绩：");
			double score = scanner.nextDouble();
			if (score < 80) {
				continue;
			}
			sum++;
			return;
		}
		System.out.println("80分以上的人数："+sum);
		System.out.println("80分以上的人数占比："+(sum * 1.0/count) * 100+"%");
	}
}
