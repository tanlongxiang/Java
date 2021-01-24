package 实验六;
import java.util.InputMismatchException;//导入输入类型异常方法
import java.util.Scanner;
public class Yichang {
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    double sum=0,aver=0;
	    try 
	    {
	if(n==0) //判断是否会除0
	{
		throw new Exception();//手动抛出异常
	}

	try    //捕捉异常
	    {
	 double a[]=new double[n];
     for(int i=0;i<=a.length-1;i++) 
     {
       a[i]=sc.nextDouble();
       sum=sum+a[i];
     }
    aver=sum/n;
    System.out.println("正确");
    System.out.printf("aver=%.2f\n",aver);
       }
catch(InputMismatchException inputMismatchException) //调用程序自带的异常方法，这个异常是输入类型不匹配异常
	{
	System.out.println("数值错误");
	}	
		}
	   catch(Exception e) {//程序自带异常，这个异常是其他异常的祖先类
	    	System.out.println("除0错误，n不能等于0");
	    	}
	   
	   finally {
	    	System.out.println("程序结束"); 
	    	sc.close();
	          }	   
	}    
	}


