package cn.choose.demo;

import java.util.Scanner;

public class Demo06Buy {
	/**
	 * 买彩票
	 * 	如果体彩中了500万，我买车、资助希望工程，去欧洲旅游
	 * 	如果没中，我买下一期体彩，继续烧高香
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您中奖的金额：");
		double money = scanner.nextDouble(); // 获取用户的中奖金额
		
		/**
		 * 01.使用三元表达式
		 */
		String result = (money>500)?"买车、资助希望工程、去欧洲旅游":"买下一期的体彩，继续烧高香";
//		System.out.println(result);
		/**
		 * 02.使用if else
		 */
		if (money>500) {
			System.out.println("买车、资助希望工程、去欧洲旅游");
		}else{
			System.out.println("买下一期体彩，继续烧高香");
		}
	}

}
