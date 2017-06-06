/**
 * package：包的声明！
 * 代表我们当前的java源文件在项目中的位置！
 * 必须位于除了注释之外的第一行！
 * 而且整个java源文件中，只允许有一个包的声明！
 * 
 * 包的命名规范：
 * 	exam.bdqn.cn
 * 	d.bdqn.cn
 * 	a.bdqn.cn
 * 	www.baidu.com
 * 	www.jd.com
 * 	www.taobao.com
 * 
 * 域名的后缀，公司名，项目名，，模块名
 * 	01.域名倒置
 * 	02.包名全小写
 * 
 * 优点：
 * 	01.便于管理我们的项目
 * 	02.避免类名冲突
 */
package cn.bdqn.test;

/**
 * 计算机程序：为了让计算机执行某些操作或者解决某个问题，而编写的一系列有序指令的集合！
 * 
 * 编写程序的工具就是计算机语言！java就是多种语言中的一个！
 * 
 * 文档注释（javaDoc）
 * @author Administrator
 * 	这是我使用myeclipse开发工具创建的第一个程序
 * 
 * java中的注释：
 * 	01.文档注释
 * 	02.多行注释
 * 	03.单行注释
 * 
 * 注释的目的：
 * 	01.方便团队内部人员的阅读
 * 	02.方便项目后期的维护
 * 
 * 我们务必要养成 书写 注释的习惯！
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *
 */
public class HelloWorld {
	/**
	 * 
	 * @param args 方法缩写带的参数
	 * 
	 * static: 修饰符！
	 * void:代表方法返回值类型！如果方法没有返回值，则必须写成void！
	 * main:方法的名称
	 * String[]:参数的类型
	 * args:参数的名称
	 */
	public static void main(String[] args) {
		/**
		 *  alt + ↑/↓      向上/向下移动光标所在处的代码
		 *  ctrl+alt+ ↑/↓  向上/向下复制光标所在处的代码
		 */
		System.out.print("大家好\n");
		System.out.print("大家\t辛苦");
	}
}
