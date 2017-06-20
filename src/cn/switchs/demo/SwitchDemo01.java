package cn.switchs.demo;

import java.util.Scanner;

public class SwitchDemo01 {

	/**
	 * 韩嫣参加计算机编程大赛
	 * 	如果获得第一名，将参加麻省理工大学组织的1个月夏令营
	 * 	如果获得第二名，将奖励惠普笔记本电脑一部
	 * 	如果获得第三名，将奖励移动硬盘一个
	 * 	否则，不给任何奖励
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入比赛的名次：");
		int num = scanner.nextInt();
		
		/*
		 * 多重if 适合于 区间的判断
		 * if(num == 1){
		 * 	System.out.println("参加麻省理工大学组织的1个月夏令营");
		 * }else if(num == 2){
		 * 	System.out.println("奖励惠普笔记本电脑一部");
		 * }else if(num == 3){
		 *  System.out.println("奖励移动硬盘一个");
		 * }else{
		 * 	System.out.println("回家继续努力学习java！");
		 * }
		 * 
		 */
		
		/*
		 * 使用switch 做等值的判断
		 * 表达式的取值：byte short int char Enum(枚举) String(1.7)
		 * switch(表达式){
		 * 	case 常量1:
		 * 		//代码块
		 * 		break;
		 * 	case 常量2:
		 * 		//代码块
		 * 		break;
		 * 	default:
		 * 		//代码块	没有找到匹配项	会执行default
		 * 		break;	
		 * }
		 */
		
		switch (num) {
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
			break;
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
		case 3:
			System.out.println("奖励移动硬盘一个");
			break;
		default:
			System.out.println("回家继续努力学习java！");
			break;
		}
	}

}
