import java.util.Scanner;
public class dayofyear {
public static void main(String[] args){
	Scanner scan=new Scanner (System.in);
	System.out.println("请输入一个年份");
	int year=scan.nextInt();
	System.out.println("请输入一个月份");
	int month=scan.nextInt();
	System.out.println("请输入一个日期");
	int date=scan.nextInt();
	int dayofyear=0;
	
	switch(month){
	case 1:
		dayofyear=date;
		break;
	case 2:
		dayofyear=31+date;
		break;
	case 3:
		dayofyear=28+31+date;
		break;
	case 4:
		dayofyear=28+31+31+date;
		break;
	case 5:
		dayofyear=28+31+31+30+date;
		break;
	case 6:
		dayofyear=28+31+31+30+31+date;
		break;
	case 7:
		dayofyear=28+31+31+30+31+30+date;
		break;
	case 8:
		dayofyear=28+31+31+30+31+30+31+date;
		break;
	case 9:
		dayofyear=28+31+31+30+31+30+31+31+date;
		break;
	case 10:
		dayofyear=28+31+31+30+31+30+31+31+30+date;
		break;
	case 11:
		dayofyear=28+31+31+30+31+30+31+31+30+31+date;
		break;
	case 12:
		dayofyear=28+31+31+30+31+30+31+31+30+31+30+date;
		break;
		default:
		System.out.println("对不起你的输入有误");		
	}
	System.out.println(year+"年"+month+"月"+date+"日是当年当中的第"+dayofyear+"天");
}
}
