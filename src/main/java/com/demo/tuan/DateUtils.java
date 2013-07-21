package com.demo.tuan;

public class DateUtils {

	public static String format(String str) {

		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		// 开始时间.
		java.util.Date date = new java.util.Date(
				java.lang.Integer.parseInt(str));
		
		return sdf.format(date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(format("1369670400"));
		System.out.println(format("1375250400"));
	}

}
