package cn.util.Scanner;

import java.util.Scanner;

import javax.xml.transform.Templates;

public class Demo09 {
	/**
	 * 现会员卡中奖
	 * 	商场推出幸运抽奖活动
	 * 	抽奖规则
	 * 	顾客的四位会员卡号的
	 * 	各位数字之和大于20，
	 * 	则为幸运顾客
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入一个4位会员卡号：");
		int num = scanner.nextInt();
		// 获取各位的数字
		int one = num % 10;
		int ten = num / 10 % 10;
		int hundred = num /100 % 10;
		int thousand = num / 1000;
		// 获取 各位 的数字之和
		int sum = one + ten +hundred + thousand;
		// 和 20 比较大小
		boolean result = sum > 20;
		System.out.println("是幸运客户吗？===="+result);
	}
}
