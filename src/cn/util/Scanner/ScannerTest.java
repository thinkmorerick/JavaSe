package cn.util.Scanner;

import java.util.Scanner;

// Scanner测试代码1

/**
 * 所有在java.lang包下面的所有类，不需要显示的引入包！
 * java.util.Scanner:想获取用户的输入，必须引入相关的类
 * @author Administrator
 *
 */
public class ScannerTest { // 获取用户的输入
	public static void main(String[] args) {
		System.out.println("请输入您的姓名：");
		// 创建一个Scanner对象 通过new关键字，System.in:用户的输入
		Scanner input = new Scanner(System.in);
		String name = input.next(); //这个next()只能用String类型的变量来接收
		System.out.println("请输入您的年龄：");
		int age = input.nextInt(); //这个next()只能用int类型的变量来接收
		System.out.println("您输入的姓名是："+name);
		System.out.println("您输入的年龄是："+age);
		
		System.out.println("*****************判断用户有没有输入****************");
		boolean flag = input.hasNext();
		System.out.println("判断用户有没有输入："+flag);
		
		System.out.println("*****************判断用户是否输入的是整数****************");
		flag = input.hasNextInt();
		System.out.println("判断用户是否输入的是整数："+flag);
		
		System.out.println("*****************判断用户是否输入的是浮点数****************");
		flag = input.hasNextDouble();
		System.out.println("判断用户是否输入的是浮点数："+flag);
	}

}
