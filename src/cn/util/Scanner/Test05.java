package cn.util.Scanner;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		/**
		 * 实现一个数字加密器，加密规则是 加密结果：（整数 * 10 + 5）/2 + 3.14159 加密结果仍为一整数
		 */

		Scanner input = new Scanner(System.in);
		// 提示用户输入
		System.out.println("请您输入一个整数：");
		int num = input.nextInt(); // ctrl + 1 快速补全
		// int result = (int) ((num * 10 + 5) /2 + 3.14159);
		int result = ((num * 10 + 5) / 2 + (int) 3.14159);
		System.out.println("结果是：" + result);
	}

}
