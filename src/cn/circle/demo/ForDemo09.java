package cn.circle.demo;

public class ForDemo09 {
	//break 跳出当前循环结构
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("第"+i+"圈");
			if (i == 8) {
				System.out.println("坚持不住！！！");
				break;
			}
		}
		System.out.println("比赛结束！");
	}
}
