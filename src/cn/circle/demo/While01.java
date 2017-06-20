package cn.circle.demo;

public class While01 {

	public static void main(String[] args) {
		
		/*
		 * while(循环条件){
		 * 	循环体
		 * }
		 * 循环条件，必须一个boolean类型的值！
		 * 
		 * 当满足了循环条件，会执行循环体，直到不满足循环条件是退出！
		 */
		System.out.println("大家辛苦了1");
		System.out.println("大家辛苦了2");
		System.out.println("大家辛苦了3");
		System.out.println("大家辛苦了4");
		System.out.println("大家辛苦了5");
		System.out.println("*************************");
		// 定义一个变量，用来保存，循环的次数
		int num = 0;
		while (num <= 10000) {
			System.out.println("大家辛苦了"+num);
			// 自身+1
			num++;
		}
		System.out.println(num);
	}

}
