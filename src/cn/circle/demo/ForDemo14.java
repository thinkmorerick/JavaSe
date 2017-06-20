package cn.circle.demo;

// 三种循环获取100以内的偶数和
public class ForDemo14 {
	
	public static void main(String[] args) {
		// 01.使用while循环
		int num = 0;
		int sum = 0; // 求和
		while (num <= 100) {
			// 找到偶数并相加
			if (num % 2 == 0) {
				sum += num; // sum=sum+num??
			}
			num++;
		}
		System.out.println("while偶数和是："+sum);
		
		// 02.使用 do while
		sum = 0;
		num = 0;
		do {
			if (num % 2 == 0) {
				sum += num;
			}
			num++;
		} while (num <= 100);
		System.out.println("dowhile偶数和是：" + sum);
		
		// 03.使用for
		sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("for偶数和是："+sum);
		
	}
}
