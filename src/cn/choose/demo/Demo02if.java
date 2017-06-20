package cn.choose.demo;

import java.util.Scanner;

public class Demo02if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入张浩的java成绩：");
		double javaScore = scanner.nextDouble();
		/**
		 * 01.使用三元表达式，解决问题
		 * String result = (javaScore>90)?"奖励mp4":"没有奖励";
		 * 
		 * 02.使用 选择结构 if(表达式){
		 * 				输出语句
		 * 				}
		 * 表达式：必须是boolean
		 * 表达式为true 会执行 输出语句
		 * 
		 * {}只有一条输出语句的时候，可以省略！但是不建议省略
		 */
		if (javaScore>90) {
			System.out.println("奖励mp4");
		}
	}
}
