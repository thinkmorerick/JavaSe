package cn.switchs.demo;

import java.util.Scanner;

public class SwitchDemo03 {
	public static void main(String[] args) {
		System.out.println("***********1级菜单***********");
		System.out.println("1.登录系统");
		System.out.println("2.退出系统");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入选择：");
		switch (scanner.nextInt()) { // 直接接收用户的输入
		case 1:
			System.out.println("***********2级菜单***********");
			System.out.println("1.客户信息管理");
			System.out.println("2.购物清算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			System.out.println("请您输入选择：");
			// 再次接收用户的输入
			int answer = scanner.nextInt();
			switch (answer) {
			case 1:
				System.out.println("1.进入了客户信息管理");
				break;
			case 2:
				System.out.println("2.购物结算");
				break;
			case 3:
				System.out.println("3.真情回馈");
				break;
			case 4:
				System.out.println("4.注销");
				break;
			}
			break;

		case 2:
			System.out.println("感谢您的使用！退出系统");
			break;
		}
	}
}
