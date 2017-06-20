package cn.switchs.demo;

import java.util.Scanner;

public class SwitchDemo05 {
	public static void main(String[] args) {
		// 定义一个变量	保存换购增加的金额
		int extra = 0;
		int choose = 0; // 用户默认的选择
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入消费金额：");
		double money = scanner.nextDouble();
		System.out.println("是否参加优惠换购活动：");
		String answer = scanner.next();
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
			System.out.println("2：满100元，加3元换购500ml可乐1瓶");
			System.out.println("3：满100元，加10元换购5公斤面粉");
			System.out.println("4：满200元，加10元换购1个苏泊尔炒菜锅");
			System.out.println("5：满200元，加20元换欧莱雅爽肤水一瓶");
			System.out.println("0：不换购");
			System.out.println("请输入选择：");
			if (scanner.hasNextInt()) { // 判断用户输入是否是整数
				// 记录用户的选择
				choose = scanner.nextInt();
				switch (choose) {
				case 1:
					if (money>=50) {
						extra = 2;
					}
					break;
				case 2:
					if (money>=100) {
						extra = 3;
					}
					break;
				case 3:
					if (money>=100) {
						extra = 10;
					}
					break;
				case 4:
					if (money>=200) {
						extra = 10;
					}
					break;
				case 5:
					if (money>=200) {
						extra = 20;
					}
					break;
				case 0:
					System.out.println("您选择了不换购！");
					break;
				}
			}else {
				System.out.println("您输入的不正确！");
			}
		}else if (answer.equalsIgnoreCase("n")) {
			System.out.println("谢谢您的光临！");
		}else {
			System.out.println("您的输入不正确！");
		}
		
		// 结账
		double totalMoney = money + extra;
		System.out.println("您共消费："+totalMoney);
		switch (choose) {
		case 1:
			System.out.println("成功换购百事可乐饮料1瓶");
			break;
		case 2:
			System.out.println("成功换购500ml可乐1瓶");
			break;
		case 3:
			System.out.println("成功换购5公斤面粉");
			break;
		case 4:
			System.out.println("成功换购1个苏泊尔炒菜锅");
			break;
		case 5:
			System.out.println("成功换购欧莱雅爽肤水一瓶");
			break;

		default:
			System.out.println("没有任何换购");
			break;
		}
	}
}
