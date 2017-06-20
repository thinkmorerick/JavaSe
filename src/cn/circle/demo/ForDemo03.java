package cn.circle.demo;

import java.util.Scanner;

public class ForDemo03 {

	public static void main(String[] args) {
		//根据用户的输入，产生对应的加法表
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入一个数字：");
		int num = scanner.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.println(i + "+" + (num - i) + "="+(num));
		}
	}

}
