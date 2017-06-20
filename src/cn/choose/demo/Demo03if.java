package cn.choose.demo;

import java.util.Scanner;

public class Demo03if {

	/**
	 * 张浩的Java成绩大于98分，而且音乐成绩大于80分，老师会奖励他;
	 * 或者Java成绩等于100分，音乐成绩大于70分，老师也会奖励他
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的java成绩");
		double javaScore = scanner.nextDouble();
		System.out.println("请输入您的音乐成绩");
		double musicScore = scanner.nextDouble();
		
		/**
		 * 条件判断
		 */
		
		if ((javaScore>98 && musicScore>80)||(javaScore == 100 && musicScore>70)) {
			System.out.println("老师奖励您一个包包....");
		}
	}

}
