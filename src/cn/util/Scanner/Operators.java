package cn.util.Scanner;

// 等量转换

public class Operators {
	public static void main(String[] args) {
		int num1 = 5; // 把 =右边的值  赋值给了 =左边的变量
		int num2 = 10;
		System.out.println("num1===="+num1);
		System.out.println("num2===="+num2);
		System.out.println("==========等量转换后==========");
		// 寻找一个空瓶子
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1===="+num1);
		System.out.println("num2===="+num2);
	}
}
