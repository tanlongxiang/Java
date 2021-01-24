package 实验六;
import java.util.Scanner;
public class 成绩 {
	public static void main(String[] args) {
		System.out.println("输入百分制成绩：");
		Scanner num=new Scanner(System.in);//从键盘输入
		int socre=num.nextInt();//赋值声明
	    chengji a=new chengji();//创建对象调用构造方法
		try {                   //try语句捕捉异常
			a.show(socre);
		} 
		catch (NumbeRangeException e) {
			System.out.println(e.message);//打印异常信息
		}
		num.close();
	}
}

class chengji {
	void show(int socre) throws NumbeRangeException{
		if(socre<0||socre>100)//进行判断是否抛出异常
		throw new NumbeRangeException();   //抛出异常
		switch(socre/10) {
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
			
		}
		
	}
		}
class NumbeRangeException extends Exception{//自定义异常
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message="成绩异常，请输入正确的成绩";
	String warnMess() {
		return message;
	}
    
	}
