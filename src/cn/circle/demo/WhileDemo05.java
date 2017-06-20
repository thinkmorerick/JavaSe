package cn.circle.demo;

public class WhileDemo05 {
	/**
	 * 编程实现：计算100以内（包括100）的偶数之和
	 * 设置断点调试程序，观察每一次循环中变化值的变化
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		int sum = 0; // 记录所有的偶数和
		while (num <= 100) {
			if (num % 2 == 0) {
				sum += num; // sum=sum+num
			}
			num++;
		}
		System.out.println("所有的偶数和："+sum);
	}
}
