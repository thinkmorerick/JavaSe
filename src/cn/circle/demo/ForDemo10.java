package cn.circle.demo;

import java.util.Scanner;

public class ForDemo10 {
/**
 * 循环录入某学生5门课的成绩并计算平均分。
 * 如果某分数录入为负，停止录入并提示录入错误
 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 用来保存总成绩
		double sum = 0;
		// 标记 是否计算平均分
		boolean flag = true;
		for (int i = 1; i <= 5; i++) {
			System.out.println("请您输入第"+i+"门课程的成绩：");
			double score = scanner.nextDouble();
			if (score < 0) { // 分数为负数
				System.out.println("您的输入有误！退出系统！");
				flag = false;
				break;
			}
			sum += score;
		}
		if (flag) { // flag = true
			System.out.println("平均分是："+(sum / 5));
		}
	}
}
