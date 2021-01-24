import java.util.Scanner;
public class Text {
	public static void main(String[] args) {
		System.out.println("输入x的值：");
		Scanner num=new Scanner(System.in);//从键盘输入
         int x=num.nextInt();//	从键盘输入的数赋值
         int y;
         if(x<1) {
        	y=x;
        	System.out.println("输出y的值："+"\n"+y);
         }
         else if((1<=x)&&(x<10)) {//逻辑与
        	y =2*x-1;
        	System.out.println("输出y的值："+"\n"+y);
         }
         else {
            y=3*x-1;
            System.out.println("输出y的值："+"\n"+y);
         num.close();
         }
         }
	}

