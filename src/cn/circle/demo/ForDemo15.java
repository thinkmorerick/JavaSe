package cn.circle.demo;

//a+=b与 a=a+b
public class ForDemo15 {
	public static void main(String[] args) {
		// a+=b a=a+b 是一致的吗？
		int a = 5;
		double b = 5;
//		 a = a + b;
		a +=b; //做了强制类型转换(int) (a + b) 不会编译报错
		System.out.println(a);
	}
}
