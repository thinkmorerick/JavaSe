package cn.util.Scanner;

import java.util.Scanner;

// Scanner测试代码2

public class ScannerTest2 {
	public static void main(String[] args) {
		/**
		 * 测试两种方式
		 *  01.一个一个输入
		 *  02.一次性输入所有，每个变量之间使用空格隔开
		 */
		System.out.println("请输入您的姓名：");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.println("请输入您的年龄：");
		int age = input.nextInt();
		System.out.println("请输入您的地址：");
		String address =  input.next();
		
		System.out.println("您输入的姓名是："+name);
		System.out.println("您输入的年龄是："+age);
		System.out.println("您输入的地址是："+address);
	}
}
