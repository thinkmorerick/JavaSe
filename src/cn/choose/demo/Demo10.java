package cn.choose.demo;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		/*
		 * 需求：
		 * 学校举行运动会，百米赛跑跑入10秒内的学生有资格进决赛
		 * 根据性别分别进入男子组和女子组
		 * 
		 * 分析：
		 * 判断是否能够进入决赛
		 * 	在确定进入决赛的情况下，判断是进入男子组，还是女子组
		 * 
		 * 	嵌套if：在一个条件判断的代码块中，又写了一个或者多个条件判断
		 */
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("请您输入赛跑的成绩（秒）：");
		double score = scanner.nextDouble();
		if (score<=10) { //进入了决赛
			System.out.println("进入了决赛！请您输入性别：");
			String sex = scanner.next();
			/*
			 * 根据性别分组
			 * equals:判断两个字符串内容是否一致
			 */
			if (sex.equals("男")) {
				System.out.println("恭喜您进入了男子组！");
				System.out.println("请您输入身高：");
				double height = scanner.nextDouble();
				if (height>190) {
					System.out.println("巨人组");
				}else{
					System.out.println("矮人组");
				}
			}else {
				System.out.println("恭喜您进入了女子组！");
			}
		}else {
			System.out.println("淘汰....");
		}
	}
}
