package cn.util.Scanner;

import java.util.Scanner;

public class Pay08 {

	/*
	 * 实现购物的小系统
	 */
	public static void main(String[] args) {
		System.out.println("************欢迎光临*************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入购买商品的名称：");
		// 获取商品的名称
		String goodsName = scanner.next();
		System.out.println("请输入商品的单价：");
		// 获取单价
		double goodsPrice = scanner.nextDouble();
		System.out.println("请输入购买商品的个数：");
		// 获取个数
		int goodSize = scanner.nextInt();
		// 计算总金额 = 单价 * 个数
		double sum = goodsPrice * goodSize;
		System.out.println("请输入商品的折扣：");
		// 获取个数
		double zhe = scanner.nextDouble();
		// 输入信息
		System.out.println("***********消费单***********");
		System.out.println("购买商品\t\t单价\t\t个数\t\t金额");
		System.out.println(goodsName+"\t\t"+goodsPrice+"\t\t"+goodSize+"\t\t"+sum);
		System.out.println("折扣："+zhe);
		System.out.println("总金额："+sum);
		System.out.println("实际消费："+(sum*zhe));
		System.out.println("请您输入交费金额：");
		double pay = scanner.nextDouble(); // 获取交费钱数
		System.out.println("实际消费："+(sum * zhe));
		System.out.println("找零："+(pay-(sum * zhe)));
		// 计算积分
		int score = (int) ((sum * zhe)/10);
		System.out.println("本次购物的积分为："+score);
		
	}

}
