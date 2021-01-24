import java.util.Scanner;
import java.util.Random;    //随机生成数包
public class GuessnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("resource")
	Scanner reader =new Scanner(System.in);
     Random random=new Random();
     System.out.println("给你一个1至100之间的整数，请猜测这个数");
     int yourGuess=0;
     System.out.println("请输入你的猜测：");
     while(1>0){                            //做一循环让程序可以进行多次猜测
    int realNumber=random.nextInt(100)+1;    //random.nextInt(100)表示随机生成一个在0~99的数因为题目中要到1~100所以给生成的结果加一
     yourGuess=reader.nextInt();
     if(yourGuess>realNumber) {    //进行判断大小
    	 System.out.println("猜大了！"+"\n"+"正确的数值是："+realNumber);
     }
     else if(yourGuess<realNumber) {
    	 System.out.println("猜小了！"+"\n"+"正确的数值是："+realNumber);
     }
     else  System.out.println("猜对了！"+"\n"+"正确的数值是："+realNumber);
	}
	}
}
