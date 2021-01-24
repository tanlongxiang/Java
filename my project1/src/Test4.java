import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		System.out.println("输入百分制成绩：");
		Scanner num=new Scanner(System.in);//从键盘输入
		int grade=num.nextInt();//赋值声明
		if(grade<0||grade>100) {//判断成绩是否在100以内
		System.out.println("请输入正确的成绩");
		}
		else
		switch(grade/10) {//除以10得到十位数的数字，用十位数字来判断
		case 10:
			System.out.println("成绩等级为："+"\n"+"A");
			break;
		case 9:
			System.out.println("成绩等级为："+"\n"+"A");
			break;
		case 8:
			System.out.println("成绩等级为："+"\n"+"B");
			break;
		case 7:
			System.out.println("成绩等级为："+"\n"+"C");
			break;
		case 6:
			System.out.println("成绩等级为："+"\n"+"D");
			break;
		default:
			System.out.println("成绩等级为："+"\n"+"E");
			break;
		}
		num.close();
	}
}
