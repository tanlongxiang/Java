import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
	System.out.println("输入华氏温度：") ;        
	 Scanner temp =new Scanner(System.in);    //定义从键盘输入
	   Float f = temp.nextFloat();            //将定义的赋给一个变量
	   Float c= 5*(f-32)/9.0f;                  //公式
	   System.out.println("输出摄氏温度："+c) ;
     temp.close();
	}

}
