package cn.circle.demo;

import java.util.Scanner;

public class ForDemo06 {
	//计算年龄大于30的 占比
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 定义年龄的变量
		int age = 0;
		// 年龄大于30以上的人数
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("请您输入年龄：");
			age = scanner.nextInt();
			if (age >= 30) {
				count++;
			}
		}
		System.out.println("30岁以上的比例是："+(count/5.0*100)+"%");
		System.out.println("30岁以下的比例是："+((1-count/5.0)*100)+"%");
	}
}
