package cn.choose.demo;

import java.util.Scanner;

public class Demo08IfelseIf {
	public static void main(String[] args) {
		/**
		 * 成绩>=80:良好
		 * 成绩>=:中等
		 * 成绩<60:差
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入成绩：");
		double score = scanner.nextDouble();
		
		
		 /*
		  // 多个if 实现不了 我们想要的结果
		   if(score>=80){
		  	System.out.println("良好");
		  }
		   if(score>=60){
		   	System.out.println("中等");
		   }
		   if(score<60){
		   	System.out.println("差");
		   }
		 */
		/*
		 * 多重if
		 * if(条件1){
		 * 	满足条件1 执行
		 * }else if(条件2){
		 * 	满足条件2 执行
		 * }else if(条件3){
		 * 	满足条件3 执行
		 * }else if(条件4){
		 * 	满足条件4 执行
		 * }else{
		 * 	都不满足时 执行
		 * }
		 */

		if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 60) {
			System.out.println("中等");
		} else {
			System.out.println("差");
		}
	}
}
