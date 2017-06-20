package cn.circle.demo;

public class ErrorDemo04 {
	public static void main(String[] args) {
		/*int i = 0; //把初始变量，局部化！
		for (; i <= 5; i++) {
			System.out.println(i);
		}*/
		
		/*for(;;){ //死循环
			System.out.println(1);
		}*/
		
		/*
		for (int i = 0;; i++) { //省略了 条件判断
			System.out.println(i);
		}*/
		
		for (int i = 0; i < 10;) { //省略了 条件判断迭代变量
			System.out.println(i);
		}
		
	}
}
