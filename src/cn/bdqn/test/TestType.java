package cn.bdqn.test;

public class TestType {
	public static void main(String[] args) {
		/**
		 * 使用变量
		 * 
		 * 输入java考试成绩的最高分：98.5
		 * 输出学员的姓名： 张三
		 * 输出学员的性别： 男
		 * 
		 * 我们应该使用什么数据类型来保存变量值？？？
		 */
		double score = 98.5; // 学生成绩
		String name = "张三"; // 学生姓名
		char sex = '男'; // 性别
		
		// 输出学生信息
		System.out.println("学员的姓名："+name);
		System.out.println("学员的性别："+sex);
		System.out.println("学员的成绩："+score);
	}
}
