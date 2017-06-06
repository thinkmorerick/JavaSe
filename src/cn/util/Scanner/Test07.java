package cn.util.Scanner;

import java.util.Scanner;

public class Test07 {

	/**
	 * 从控制台输入张三同学的成绩，
	 * 与李四的成绩（80分）比较，
	 * 输入"张三的成绩比李四的成绩高吗？" 的判断结果
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入张三的成绩：");
		double zhangScore = scanner.nextDouble(); // 获取张三的成绩
		double liScore = 80;
		// 输出 张三的成绩比李四的成绩高吗 是比较？？ 使用关系运算符
		boolean result =(zhangScore > liScore);
		
		System.out.println("张三的成绩比李四的成绩高=="+result);
	}

}
