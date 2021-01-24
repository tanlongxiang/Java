package 课本例题;

public class 阶乘和 {
public static void main (String args[]) {
	//System.out.println();
	long sum=0,num=1;int a=1;
	for (int i=1;i<=20;i++) {
		sum=num+sum;
		a=a+1;
		num=(a)*num;	
	}
	System.out.print("输出1！+2！....20!的和："+"\n"+sum);
	
}

}
