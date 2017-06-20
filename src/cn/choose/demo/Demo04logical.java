package cn.choose.demo;

public class Demo04logical {
	public static void main(String[] args) {
		/**
		 * 条件判断
		 * 逻辑运算符   （短路）
		 * 1. && 与，并且  表达式1 && 表达式2
		 * 	01.如果表达式1为false，则不会执行表达式2，返回false
		 * 	02.如果表达式1为true，则继续执行表达式2
		 * 	03.两个表达式都为true！整体才返回true
		 * 	04.如果其中一个表达式为false，整体返回false
		 * 2. || 或者
		 * 	01.如果其中一个表达式为true，整体返回true
		 * 	02.如果表达式1为true，则不会执行表达式2，返回true
		 * 3. ！ 非
		 * if(!(5>4) && (6<9)){
		 * 	System.out.println("进入了代码块");
		 * }
		 */
		
		int a = 5;
		int b = 6;
		if (!(a++ == b) && (++a == b++)) {
			System.out.println("进入了代码块");
		}
		System.out.println(++a);
	}
}
