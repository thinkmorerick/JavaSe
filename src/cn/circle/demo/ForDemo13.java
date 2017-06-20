package cn.circle.demo;

import java.util.Scanner;

public class ForDemo13 {
	/**
	 * 验证用户登录，失败次数
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name; //用户名
		String password; //密码
		int i; //记录用户失败的次数
		//进行三次循环操作
		for ( i = 0; i < 3; i++) {
			System.out.println("请输入用户名：");
			name = scanner.next();
			System.out.println("请输入密码：");
			password = scanner.next();
			// 判断用户名和密码是否正确
			if ("admin".equals(name) && "admin".equals(password)) {
				System.out.println("登录成功！");
				break;
			}else {
				System.out.println("输入错误！您还有"+(2-i)+"次机会！");
			}
		}
		if (i == 3) { //3次输入都不对
			System.out.println("对不起！您三次都输入错误！");
		}
	}
}
