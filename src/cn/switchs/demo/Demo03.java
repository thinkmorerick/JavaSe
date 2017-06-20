package cn.switchs.demo;

import java.util.Scanner;

public class Demo03 {
	/**
	 * break 和 return: 之后不允许出现语句！
	 * break：跳出switch以及当前的循环结构
	 * return：跳出当前的方法体
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的成绩：");
		int score = scanner.nextInt();
		switch (score) {
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("没有奖励");
			return; // 跳出 当前的方法体
		}
		// main方法的输出是否能执行？
		System.out.println("大家辛苦了！");
	}
}
