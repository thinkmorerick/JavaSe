package cn.switchs.demo;

public class Demo02 {
	// break 和 return
	public static void main(String[] args) {
		
		 // 01.编译报错
		  /*switch(3){
		  	case 1:
		  		System.out.println("参加麻省理工大学组织的1个月夏令营");
		  	case 2:
		  		System.out.println("奖励惠普笔记本电脑一部");
		  	default:
		  		System.out.println("回家继续努力学习java！");
		  		return; // 跳出当前的方法	后续的所有代码都不会执行
		  }
		  System.out.println("程序结束");*/
		 
		// 02.编译报错
		/*switch (3) {
		default:
			System.out.println("回家继续努力学习java！");
		case 1:
			System.out.println("参加麻省理工大学");
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			return;
		}
		System.out.println("程序结束");*/
		
		//03.正常
		switch (3) {
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
			return; //跳出当前的方法 后续的所有代码都不会执行
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;
			
		default:
			System.out.println("回家继续努力学习java！");
		}
		System.out.println("程序结束");
		
		//03.正常
		/*switch (3) {
		case 1:
			System.out.println("参加麻省理工大学组织的1个月夏令营");
		case 2:
			System.out.println("奖励惠普笔记本电脑一部");
			break;

		default:
			System.out.println("回家继续努力学习java！");
			return; //跳出当前的方法 后续的所有代码都不会执行
		}
		System.out.println("程序结束");*/
	}

}
