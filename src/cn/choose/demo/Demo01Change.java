package cn.choose.demo;

public class Demo01Change {

	public static void main(String[] args) {
		/**
		 * 实现等量的转换
		 */
		int a = 50; // 可乐
		int b = 100; // 雪碧
		
		// 创建空杯子
		int temp;
		// 01.把a的值给temp，把可乐装进空杯子
		temp = a;
		// 02.把b的值给a
		a = b;
		// 03.把temp的值给b
		b = temp;
		System.out.println("a的值===="+a);
		System.out.println("b的值===="+b);
	}

}
