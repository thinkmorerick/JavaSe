package cn.bdqn.test;

/**
 * 
 * @author Administrator
 * 常量：在运行期间，不允许改变的量！
 * 
 * 使用规范：
 * 	01.常量通常大写 ctrl+shift+x/y  大/小写 MONEY
 * 	02.不同的单词之间使用下划线 分隔   MY_MONEY    FIRST_NAME
 * 	03.只能被赋值一次，通常在声明的时候赋予初始值
 */
public class TestConstant {
	public static void main(String[] args) {
		// 在声明常量的同时，赋值
		final double MONEY = 10000;
		// money = 50000; 编译报错
		System.out.println(MONEY);
	}
}
