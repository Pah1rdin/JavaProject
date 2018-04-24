package classtest;

//import java.lang.*; // Object  

public class StringTest{
	
	public static void main(String[] args) {
		
		//封装类   == 数据类型  （不能使用关键字表示  == 使用关键字的封装类（8个基本数据类型））
		//int
		//char
		
		
		//字符串的处理和解析  （使用到的String类提供的各种方法 （18个方法））
		//newClass (方法 （） 不知道这个类有什么方法  这些方法都是干什么   java API文档  CHM ())
		//每个新的类  新的接口 都是API   Scanner  ArrayList
		//String str = "123";
		
		//StringBuffer //字符串缓冲区
		//StringBuilder //字符串构建区
		
		//String[]
		//开发 经常使用的字符串
		/*StringBuffer  str = new StringBuffer();
		str.append("张三");
		str.append("李四");
		str.append("王五");
		
		System.out.print(str);*/
		
		//String url = "https://www.hao123.com/?tn=93525651_hao_pg";
		
		//获取字符中指定字符 （根据索引）
		
		//String这个类 在test包中有吗？ 没有  不需要引包  （java.lang）
		//默认引用lang中的包
		
		//
		//char a = str.charAt(0);
		
		//Byte b = 100;  
		
		
		//字符串创建方法
		//1
		//String str1 = "你好";
	/*	//2
		String str2 = new String();
		
		//3  方式一共创建了几个字符串
		// 2个  str3=null   “你好” = 引用
		String str3 = new String("你好");
		
		//4
		char [] data = {'b','o','y'};
		String str4 = new String(data);
		System.out.print(str4);
		
		//5
		char [] data = {'b','o','y'};
		String str4 = new String(data,1,1);
		System.out.print(str4);*/
		
		
		/*char a = '你好';
		char b = '我';
		System.out.println((int)a);
		System.out.println((int)b);*/
		
		
		//1方法 长度 （包含的字符个数）
		String str1 = "你好我";
		
	/*	String str2 = ""; //空串 null
		int length = str2.length();
		System.out.println(length);
		
		String str3 = " "; //空白串  1
		
		int length = str1.length();
		System.out.println(length);*/
		
		//2比较
		//equals Object重写来的
		/*boolean bol = str1.equals("你好");
		System.out.println(bol);*/
		
		
		//3以什么开头
		/*boolean bol = str1.startsWith("        ");
		System.out.println(bol);*/
		
		//4以什么结尾 （很有用）
		//判断一个文件的类型  （文件的上传和下来  upload）
		//文件 == 文件名
		/*String fileName = "xxxxx.xxx";
		boolean bol = str1.endsWith(" ");
		if(fileName.endsWith(".jpg") || fileName.endsWith(".gif") || fileName.endsWith(".bmp")){
			
		}else{
			
		}
		System.out.println(bol);*/
		
		//5比较
		//从一个接口
		//implements  Comparable<Object>  compareTo(String s);
		//compareTo来自于数据结构 （最经典的算法之一  compareTo比较出任何数据的大小）
		//返回值  int
		//int  正数    str1大
		//int  负数   你好大
		//int   0   str1==你好
		 
		int result = str1.compareTo("你好");
		System.out.println(result);
		//字符串  指针回溯法 （特别好理解  效率低下）
		//使用的是  比较使用的数据结构中最难算法  （字符串模式匹配算法   KMP）
		
		
	}

}
