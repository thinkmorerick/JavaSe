package cn.circle.demo;

public class ForDemo11 {
	/**
	 * 1-10之间的整数相加，得到累加值大于20的当前数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义变量保存 累加值
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				break; // 跳出当前循环结构！
			}
		}
		System.out.println("当前的sum===："+sum);
	}
}
