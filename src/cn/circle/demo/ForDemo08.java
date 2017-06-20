package cn.circle.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期的转换
 * @author Administrator
 *
 */
public class ForDemo08 {
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date(); //日期 格式 Mon Mar 06 11:02:55 CST 2017
		System.out.println("日期 格式："+ date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日 hh:mm:ss");
		String time = sdf.format(date); // 把日期格式 转换成 String
		System.out.println(time);
		time = "2018年-05月-05日 11:11:11";
		// 把String 转换成 日期格式
		System.out.println(sdf.parse(time));
	}
}
