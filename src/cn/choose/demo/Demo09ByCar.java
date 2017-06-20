package cn.choose.demo;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Demo09ByCar {
	public static void main(String[] args) {
		/*
		 * 我想买车，买什么车决定于我在银行有多少存款
		 *  如果我的存款超过500万，我就买凯迪拉克
		 *  否则，如果我的存款超过100万，我就买帕萨特
		 *  否则，如果我的存款超过50万，我就买伊兰特
		 *  否则，如果我的存款超过10万，我就买奥拓
		 *  否则，如果我的存款10万以下，我买捷安特
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.err.println("请您输入存款金额：");
		double money = scanner.nextDouble();
		if (money>=500) {
			System.out.println("买凯迪拉克");
		}else if (money>=100) {
			System.out.println("买帕萨特");
		}else if (money>=50) {
			System.out.println("买伊兰特");
		}else if (money>=10) {
			System.out.println("买奥拓");
		}else if (money<10) {
			System.out.println("买捷安特");
		}
		
		/*
		 * 只要满足其中一个条件 则后续判断的代码不会执行
		 * int a=5;
		 * if(a++ > 5){
		 * 	System.out.println(a);
		 * }else if(++a == 6){
		 * 	System.out.println(a);
		 * }else if(a++ <= 7){
		 * 	System.out.println(a);
		 * }
		 */
	}
}
