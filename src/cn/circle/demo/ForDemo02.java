package cn.circle.demo;

import java.util.Scanner;

public class ForDemo02 {
	/*
	 * 循环输入某同学S1结业考试的5门课成绩，并计算平均分
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入姓名：");
		//定义一个变量，来保存总成绩
		double sum = 0;
		String name = scanner.next();
		for (int i = 1; i <= 5; i++) {
			System.out.println("请您输入第"+i+"门课程的成绩：");
			double score = scanner.nextDouble();
			sum += score; //总成绩
		}
		System.out.println("平均分是："+(sum / 5));
	}

}
