package cn.circle.demo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ForDemo07 {

	public static void main(String[] args) {
		
		System.out.println("请您输入一个数字：");
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble();
		
		DecimalFormat df = new DecimalFormat("0.00"); //保留两位有效数字
		String number = df.format(num); //把double类型的数据，保留两位有效数字，返回String
		System.out.println("保留两位有效数字："+number);
		
		System.out.println("***************************");
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2); //保留两位有效数字
		number = nf.format(num);
		System.out.println("保留两位有效数字："+number);
	}

}
