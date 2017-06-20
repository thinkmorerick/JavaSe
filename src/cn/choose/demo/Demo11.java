package cn.choose.demo;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * 需求：
		 * 普通顾客购物满100元	9折
		 * 	会员购物			8折
		 * 	会员购物满200元		7.5折
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入是否是会员（Y/N）：");
		String answer = scanner.next();
		System.out.println("请您输入购物金额：");
		double money = scanner.nextDouble();
		double pay = 0; // 用户最后需要支付的金额
		
		//判断用户是否是会员  equalsIgnoreCase忽略大小写比较
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("您是会员");
			// 判断折扣
			if (money>=200) {
				pay = money * 0.75;
			}else {
				pay = money * 0.8;
			}
		}else { //普通用户
			System.out.println("您是普通用户");
			if (money>=100) {
				pay = money*0.9;
			}else {
				pay = money;
			}
		}
		System.out.println("您的实际支付金额是："+pay);
	}
}
