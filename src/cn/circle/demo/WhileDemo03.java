package cn.circle.demo;

import java.util.Scanner;

public class WhileDemo03 {
	public static void main(String[] args) {
		/*
		 * 老师每天检查张浩的学习任务是否合格。
		 * 如果不合格，则继续进行。
		 * 老师个张浩安排的每天的学习任务为：
		 * 上午阅读教材，学习理论部分，
		 * 下午上机编程，掌握代码部分。
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入是否合格？（y/n）");
		String answer = scanner.next();
		// 循环条件 ==》 是否合格？  如果不合格，一直学习！
		while (answer.equalsIgnoreCase("n")) {
			System.out.println("阅读教材，学习理论部分");
			System.out.println("上机编程，掌握代码部分");
			System.out.println("再次输入是否合格？（y/n）");
			answer = scanner.next();
		}
		System.out.println("完成了 学习任务！");
	}
}
