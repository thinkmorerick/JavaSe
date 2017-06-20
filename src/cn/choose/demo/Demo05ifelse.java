package cn.choose.demo;

public class Demo05ifelse {

	public static void main(String[] args) {
		/**
		 * 三元表达式 可以替换if else
		 * 
		 * if(表达式){
		 * 	// 表达式为true执行的代码块
		 * }else{
		 * 	// 表达式为false执行的代码块
		 * }
		 * 
		 * 如果张浩Java考试成绩大于98分，老师就奖励他一个MP4，
		 * 否则老师就罚他进行编码
		 * 
		 */
		
		int javaScore = 100; // 定于java成绩
		/**
		 *  if(javaScore > 98){
		 *  	System.out.println("老师就奖励他一个MP4");
		 *  }
		 *  
		 *  if(javaScore <= 98){
		 *  	System.out.println("老师就罚他进行编码");
		 *  }
		 */
		
		if (javaScore > 98) {
			System.out.println("老师就奖励他一个MP4");
		}else{
			System.out.println("老师就罚他进行编码");
		}
		System.out.println("谢谢您使用程序");
	}

}
