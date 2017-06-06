package cn.util.Scanner;

import java.util.Scanner;

public class Demo10 {

	/**
	 * 声明变量存储商品价格信息
	 * 	从键盘接收折扣，并保存
	 * 	计算商品享受折扣后的价格
	 * 	输出商品折扣后价是否低于100
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入商品价格：");
		double price = input.nextDouble();
		System.out.println("请您输入商品折扣：");
		double zhe = input.nextDouble();
		// 实际支付金额
		double pay = price * zhe;
		// 输出商品折扣后价是否低于100
		boolean result = pay < 100;
		System.out.println("折扣之后的价格是："+pay);
		System.out.println("输出商品折扣后价是否低于100？？"+result);
	}

}
