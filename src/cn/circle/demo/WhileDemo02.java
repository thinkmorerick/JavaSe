package cn.circle.demo;

public class WhileDemo02 {
	public static void main(String[] args) {
		/*
		 * 循环打印50份试卷
		 * 分析：
		 * 循环条件：count<=50,小于等于50次
		 * 循环体：打印试卷
		 * 
		 */
		int count = 1;
		while (count <= 50) {
			System.out.println("正在打印第"+count+"份试卷");
			// 迭代变量
			count++;
		}
	}
}
