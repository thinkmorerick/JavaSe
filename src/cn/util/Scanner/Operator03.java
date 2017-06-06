package cn.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		int a = num1 / num2; // 取整
		int b = num1 % num2; // 取余
		System.out.println("num1 / num2取整的值："+a);
		System.out.println("num1 % num2取余的值："+b);
		/**
		 * ++:自身加1
		 *  01.++在前：先自身加1，再执行操作
		 *  02.++在后：先执行操作，再自身加1
		 * -- ：自身减1
		 */
		num1++;
		num2--;
		System.out.println(++num1); // 12
		System.out.println(--num2); // 3
		
		System.out.println(num1++);
		System.out.println(num1);
	}
}
