package cn.choose.demo;

import java.util.Scanner;

public class Demo07Random {
	public static void main(String[] args) {
		/**
		 * 产生随机数
		 * 	从控制台接收一个4位会员号
		 * 	分解获得百位数
		 * 	判断是否是幸运会员
		 * 
		 * Math.random():返回的是 0-1之间的小数！但是不包含1！
		 */
		double random = Math.random();
		System.out.println("随机数为："+random);
		// 怎么让随机数是 0-9之间的数字？
		System.out.println(random * 10);
		// double 转换成 int 强制类型转换
		int result = (int)(random*10);
		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入一个会员卡号：");
		int num = scanner.nextInt();
		// 怎么获取百位的数字
		int bai = num/ 100%10;
		if (bai==result) {
			System.out.println("幸运用户");
		}else {
			System.out.println("欢迎下次光临！");
		}
		
	}
}
