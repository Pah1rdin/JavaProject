package classtest;

import java.util.Locale;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str = "abcd";
		
		//注册用户名  小写的  登录你大写 了不会的
		
		//转换大小写
	/*	String upStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();*/
		
		
		
		//地区代码  语言编码   zh-CN
		//en-GB
		//en-US
		String upStr = str.toLowerCase(Locale.FRANCE);
		
		//英语 小写  大写
		
		//String.valueOf(b) //把各种类型转换成字符串
		//""+
		
		//trim
		//客户 不懂计算机 （专业计算机人群  %4）
		//使用人群  （高管  40岁以上  青少年  18岁以下）
		String username = "admin";
	    String password = "123456";
	    
	    
	    if("admin".equals(username.trim())){
	    	if("123456".equals(password)){
	    		System.out.println("登录成功!");
	    	}
	    }
	}
}
