package cn.bdqn.test;

public class BasicVariable {
	/**
	 * 局部变量没有初始值
	 * 全局变量有初始值
	 * 在类中直接定义的变量 ===》 全局变量
	 */
	static byte byteName;
	static short shortName;
	static int intName;
	static long longName;
	static float floatName;
	static double doubleName;
	static char charName = '\u0000'; // 默认值
	static boolean booleanName;
	static String stringName;
	
	// java程序的入口
	public static void main(String[] args) {
		System.out.println("=============整型============");
		System.out.println("byte的默认值："+ byteName);
		System.out.println("shortName的默认值："+ shortName);
		System.out.println("intName的默认值："+ intName);
		System.out.println("longName的默认值："+ longName);
		System.out.println("=============浮点型============");
		System.out.println("floatName的默认值："+ floatName);
		System.out.println("doubleName的默认值："+ doubleName);
		System.out.println("=============单个字符============");
		System.out.println("charName的默认值："+ charName);
		System.out.println("=============布尔值============");
		System.out.println("booleanName的默认值："+ booleanName);
		System.out.println("=============字符串============");
		System.out.println("stringName的默认值："+ stringName); // null空值
	}
}
