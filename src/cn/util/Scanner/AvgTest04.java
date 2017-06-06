package cn.util.Scanner;

public class AvgTest04 {
	public static void main(String[] args) {
		/**
		 * 某班第一次Java考试平均分81.29
		 * 第二次比第一次多2分
		 * 计算第二次考试平均分？
		 */
		double fAvg = 81.29;
		double sAvg; // 定义一个第二次的平均分
		int rise = 2; // 增长的分数
		
		/**
		 * 自动类型转换规则
		 * 	01.如果第一个操作数是doulb，则整个表达式都是double
		 * 	02.操作数 要相互兼容！ 数值类型的数据
		 * 	03.目标类型 大于（取值范围）源类型
		 */
		sAvg = fAvg + rise;
		
		System.out.println("第二次平均分="+sAvg);
		
		System.out.println("***********************");
		System.out.println("计算之和："+5+5); // 55
		System.out.println(5+5+"计算之和"); // 10
		
		System.out.println("************************");
		
		/**
		 * 强制类型转换：把大的数据类型   转换成  小的数据类型！
		 */
		int before = 20;
		double after = 5.5;
		// 大蛋糕 装进 小盒子 ？？？ 可定装不下！
		// int now = (int) (before + after);
		int now = before + (int)after;
		System.out.println("now的值："+now);
		
		float s = (float) 50.5;
		float s1 = 50.5f;
		float s2 = 50.5F;
	}
}
