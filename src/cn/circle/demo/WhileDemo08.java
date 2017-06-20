package cn.circle.demo;

/**
 * 使用do-while实现：输出摄氏温度与华氏温度的对照表
 * 要求它从摄氏温度0度到250度，每隔20度为一项，对照表中的条目不超过10条。
 * 
 * 转换关系：华氏温度 = 摄氏温度 *9/5.0+32
 * 
 * 循环操作：计算摄氏温度，并输出对照条目
 * 循环条件：
 * 条目<=10 && 摄氏温度 <= 250
 * @author Administrator
 *
 */
public class WhileDemo08 {
	public static void main(String[] args) {
		
		int  count = 1; //对照条目
		double c = 0; //摄氏度
		double f = 0; //华氏度
		System.out.println("条目\t摄氏度\t华氏度");
		do {
			//转换
			f = c * 9 / 5.0 +32;
			System.out.println(count + "\t" +c +"\t" +f);
			count++;
			c += 20;
		} while (count <= 10 && c <= 250);
	}
}
