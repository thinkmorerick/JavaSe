package cn.util.Scanner;

import java.util.Scanner;

public class Demo11 {

	/**
	 * 一元运算符： 一个表达式就可以参与运算！
	 * 		++ --
	 * 
	 * 二元运算符：二个表达式就可以参与运算！
	 * 		+  /  *  -  %
	 * 三元运算符：三个表达式就可以参与运算！
	 * 		数据类型 变量名 = 表达式1？表达式2：表达式3
	 * 		String result (5>4)?"真":"假";
	 * 
	 * 表达式1：必须是boolean类型的值！也就是  必须使用关系运算符！
	 * 表达式2：表达式1为true的时候执行的表达式！
	 * 表达式3：表达式1为false的时候执行的表达式！
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 总数量（totalCount）		页大小（pageSize）           总页数（pageCount）
		 * 101					10					11
		 * 100					10					10
		 * x					x					x
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您输入总数量：");
		int totalCount = scanner.nextInt();
		System.out.println("请您每页显示几条数据：");
		int PageSize = scanner.nextInt();
		
		/**
		 * 怎么求总页数？？
		 * （总数量%页大小==0）（总数量/页大小）
		 * （总数量%页大小!=0）（总数量/页大小+1）
		 * 
		 * 使用三元表达式？？
		 */
		
		int pageCount = (totalCount%PageSize==0)?(totalCount/PageSize)
				:(totalCount/PageSize+1);
		System.out.println("应该是多少页？？"+pageCount);
	}

}
