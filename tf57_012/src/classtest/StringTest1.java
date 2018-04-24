package classtest;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		//10多个方法
		//单拿出一个来都可以会用
		//需求 10多个方法综合起来应用
		//KMP算法
		
		//检索字符串
		String str = "abcdefgabcdabcd";
		//String str1 = "a";
		//用目标串作为 目标  在里面检索你需要的字符或字符串  出现他的位置
		//数组实现的 就有index 顺序的   从0开始
		
		//检索str1 在str中第一次出现的位置
		//从0开始
		//从左往右
		/*int wz = str.indexOf(str1);
		System.out.println(wz);*/
		
		
		//检索str1 在str中最后一次出现的位置
		//从0开始
		//从左往右
		/*int wz = str.lastIndexOf(str1);
		System.out.println(wz);*/
		
		//满足特定需求   重载
		
		//从1开始
		/*int wz = str.indexOf(str1,1);
		System.out.println(wz);*/
		
		//到10结束
		/*int wz = str.lastIndexOf(str1,10);
		System.out.println(wz);*/
		
		
		//String str = "sab#cdefgabc#dabcd";
		
		//从5开始截取  舍掉5之前的
		/*String newStr = str.substring(5);
		System.out.println(newStr);*/
		
		//从3开始 到6结束  得到3-6之间的字符串  不包含6
		/*String newStr = str.substring(3,6);
		System.out.println(newStr);*/
		
		
		//替换
	String newStr = str.replaceAll("a", "h");
		System.out.println(newStr);
		
		//去掉左右空格
		/*String newStr = str.trim();
		System.out.println(newStr);*/
		
		
		//分割
		//得到多个字符串
	/*	String [] newStr = str.split("#");
		
		System.out.println(newStr.length);
		System.out.println(newStr[0]);
		newStr[0].split();
		System.out.println(newStr[1]);
		System.out.println(newStr[2]);
		System.out.println(newStr[3]);*/
		
		//String str = "张-三#李-四#王-5";
		//分割  要张三  李四  王五
	}

}
