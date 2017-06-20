package cn.switchs.demo;

import java.util.Scanner;

public class HasNextDemo04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请你输入一个整数：");
		boolean flag = scanner.hasNextInt();
		System.out.println(flag);
		System.out.println("您输入的数字是："+scanner.next());
		
		/*
		 * hasNext...()系列
		 * 01.获取用户的输入
		 * 02.判断用户的输入
		 * 
		 * 	if(scanner.hasNextInt()){
		 * 		System.out.println("您输入的是整数");
		 * 	}else{
		 * 		System.out.println("您输入的不是整数");
		 * 	}
		 */
	}
}
