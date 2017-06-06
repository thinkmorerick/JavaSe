package cn.util.Scanner;

import java.util.Scanner;

/**
 * import: 导入需要的类！ import可以出现多次！
 * 
 * @author Administrator
 *
 */
public class ScannerTest4 {
	public static void main(String[] args) {
		/**
		 * 从控制台输入学员王浩3门课程的成绩，编写程序实现 01.Java课和SQL课的分数之差 02.3门课的平均分
		 */
		// 01.创建Scanner对象
		Scanner scanner = new Scanner(System.in);

		// 获取学员王浩3门课程成绩
		System.out.println("请输入您的java成绩：");
		// 02.获取用户的输入
		double javaScore = scanner.nextDouble(); // 获取用户输入

		System.out.println("请输入你的sql成绩：");
		double sqlScore = scanner.nextDouble(); // 获取用户输入

		System.out.println("请输入您的music成绩：");
		double musicScore = scanner.nextDouble(); // 获取用户输入

		// 03.使用变量
		System.out.println("您的java成绩是：" + javaScore);
		System.out.println("您的sql成绩是：" + sqlScore);
		System.out.println("您的music成绩是：" + musicScore);

		// Java课和SQL课的分数之差
		System.out.println("Java课和SQL课的分数之差：" + (javaScore - sqlScore));
		System.out.println("3门课的平均分：" + ((javaScore + sqlScore + musicScore) / 3));
	}
}
