package cn.circle.demo;

public class ForDemo01 {

	public static void main(String[] args) {
		/**
		 * for(表达式1;表达式2;表达式3){
		 * 	循环体
		 * }
		 * 表达式1：初始化变量 int a=0;
		 * 表达式2：循环条件！满足条件执行循环体操作！
		 * 表达式3：迭代变量！
		 * 
		 * 三个表达式都可以省略！但是;不能省略！
		 * 
		 * 执行顺序：
		 * 	表达式1 --->表达式2 ---> 循环体 --->表达式3 --->表达式2 --->循环体 --->表达式3
		 */
		for (int i = 1; i <= 100; i++) {
			System.out.println("好好学习！"+i);
		}
	}

}
