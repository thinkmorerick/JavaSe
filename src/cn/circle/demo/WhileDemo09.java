package cn.circle.demo;

public class WhileDemo09 {

	/*
	 * 实现一个数字的反转
	 */
	public static void main(String[] args) {
		int num = 123456789;
		int temp = 1;
		System.out.print("反转之后的数字：");
		while (num != 0) {
			// 依次与10取余
			temp = num % 10; // 6
			System.out.print(temp);
			num = num / 10;
		}
	}

}
