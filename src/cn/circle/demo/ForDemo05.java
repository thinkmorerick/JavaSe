package cn.circle.demo;

public class ForDemo05 {
	public static void main(String[] args) {
		int sum = 0;
		// 求1-100之间不能被3整除的数之和
		for (int i = 0; i <= 100; i++) {
			// 不能被3整除的数
			if (i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println("不能被3整除的数之和："+sum);
	}
}
