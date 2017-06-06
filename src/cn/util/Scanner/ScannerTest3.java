package cn.util.Scanner;

import java.util.Scanner;

// nextLine（）的使用

public class ScannerTest3 {
	public static void main(String[] args) {
		System.out.println("请输入您的姓名：");
		Scanner input = new Scanner(System.in);
		/**
		 * String name = input.next();
		 * 
		 *  如果这里输入的而是    小黑   50  只能拿到小黑
		 *  也就是拿到   空格  之前的第一个
		 *  我想拿到所有？？    就不能再使用next()
		 *  使用nextLint()
		 */
		String name = input.nextLine();
		System.out.println("您输入的姓名是："+ name);
	}
}
