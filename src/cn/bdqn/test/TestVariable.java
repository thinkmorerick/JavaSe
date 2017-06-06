package cn.bdqn.test;
// 变量和基本数据类型

/**
 * 
 * @author Administrator
 *
 * 变量：会变化的量？
 * 	一个数据在内存中存储空间的表示！在运行期间可以动态改变！
 * 
 * 关键字：在java中已经被使用或者定义的单词！不能作为变量名！
 * 
 * java中八种基本数据类型
 * 
 * byte 一个字节占8个bit 取值范围 -128 127
 * short 短整型
 * int 整型   取值范围 -2的31次方  2的31次方-1
 * long 长整型
 * float 单精度浮点型
 * double 双精度浮点型
 * 
 * char 字符 如果存储的是数值 取值范围 0-65535
 * boolean 布尔值 true false
 * 
 * 引用数据类型
 * String
 * 
 * java中只有两个保留字（有可能成为关键字）：goto const
 * 
 * 变量的命名规范：
 * 01.满足驼峰命名法，首字母小写
 * 02.有意义
 * 03.首字母必须以 字母，下划线_ 美元符号$ 人民币符号￥ （中文下 shift+4）开头
 * 04.对大小写敏感
 * 05.不能使用关键字和保留字作为变量名
 */
public class TestVariable {
	// java程序的入口
	public static void main(String[] args) {
		/**
		 * 怎么使用变量？
		 * 
		 
		// 01.声明变量（在内存中 开辟空间） ===> 数据类型 变量名
		double money;
		// 02.赋值（将数据存储到对应的内存空间）变量名=数值
		money = 10000;
		// 03.使用变量（通过变量名从内存中取出数据）
		System.out.println("money的值===》"+money);
		*/
		//在声明变量的同时，给变量赋值
		double money = 10000;
		/**
		 * 第2次给变量重新赋值的时候，不能加数据类型
		 * 比如说，某宾馆的101-110之间都是单人间！
		 * 不可能出现相同的房间号！
		 */
		money = 20000;
		// 直接使用
		System.out.println("money--->"+money);
		
	}
}
