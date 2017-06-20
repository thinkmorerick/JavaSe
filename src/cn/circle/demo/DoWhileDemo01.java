package cn.circle.demo;

import java.util.Scanner;

public class DoWhileDemo01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double money = 0;
		String answer = "";
		do { //先执行，再判断
			System.out.println("欢迎进入MyShoppping管理系统");
			System.out.println("**********************");
			System.out.println("1.帽子 \t2.网球鞋 \t3.球拍");
			System.out.println("请您输入购买物品的编号");
			int choose = scanner.nextInt(); //获取用户的选择
			System.out.println("请您输入购买的数量");
			int count = scanner.nextInt(); //获取用户购买的数量
			switch (choose) {
			case 1:
				System.out.println("您购买的是 1.帽子\t ￥50 \t总金额："+(count * 50));
				money += (count * 50);
				break;
			case 2:
				System.out.println("您购买的是 1.网球鞋\t ￥30 \t总金额："+(count * 30));
				money += (count * 30);
				break;
			case 3:
				System.out.println("您购买的是 1.球拍\t ￥5 \t总金额："+(count * 5));
				money += (count * 5);
				break;
			}
			System.out.println("是否继续购物？（y/n）");
			answer = scanner.next();
		} while (answer.equalsIgnoreCase("y"));
		System.out.println("您本次消费是："+money);
		System.out.println("请您输入支付金额：");
		double pay = scanner.nextDouble();
		while (pay<money) { //说明金额不正确
			System.out.println("金额不正确！请重新支付！");
			pay = scanner.nextDouble();
		}
		System.out.println("找零："+(pay - money));
	}
}
