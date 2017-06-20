package cn.choose.demo;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		/*
		 * 需求：
		 * 	会员积分			折扣
		 * 	x<2000			9折
		 * 	2000<x<4000 	8折
		 *  4000<x<8000		7折
		 *  x>8000			6折
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入会员积分：");
		int custCount = scanner.nextInt();
		// 定义一个变量来接收 折扣
		double discount;
		if (custCount < 2000) {
			discount=0.9;
		}else if (2000 <= custCount && custCount < 4000) {
			discount=0.8;
		}else if (4000 <= custCount && custCount < 8000) {
			discount=0.7;
		}else { // 大于8000
			discount=0.6;
		}
		System.out.println("您享受的折扣是："+discount);
	}
}
