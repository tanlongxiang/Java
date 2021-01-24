package 实验五;
import java.util.*;
interface ComputerAverage{           //接口的声明 
	public double average(double x[]);     //写一个抽象方法
}
class Gymnastics implements ComputerAverage{      //创建类声明自己实现接口 
	public double average(double x[])              //重写接口里面的抽象方法  
	{   
		Arrays.sort(x);        //调用排序方法
	    double sum=0;             
	    if(x.length>2)          //判断数组长度是否大于2
 {
		for(int i=1;i<x.length-1;i++) //设置for环输出数组第二位到倒数第二位的和
		{
			    sum=sum+x[i];
		}
		return sum/(x.length-2);        //返回平均值
 }
	    else  return sum=0;
		
	}
}
class School implements ComputerAverage{   
	public double average(double x[]) {  //重写接口中的抽象方法
	    double sum=0;
	    for(int i=0;i<x.length;i++)       //设置for循环输出数组和
	    {
	    	sum=sum+x[i];
	    }
	    return sum/x.length;//求平均值
   }
}
public class Estimator {
     
	public static void main(String[] args) {
	     double a[]={9.89,9.88,9.99,9.12,9.69,9.76,8.97};
	     double b[]={89,56,78,90,100,77,56,45,36,79,98};
         ComputerAverage computer;       //创建ComputerAverage接口的对象
         computer=new Gymnastics();     //computer作为Gymnastics的上转型对象
         double result=computer.average(a);  //调用方法将结果赋值给result
         System.out.printf("%n");                                    
         System.out.printf("体操选手最后得分：%5.3f\n",result);
         computer=new School();             
         result=computer.average(b);
         System.out.printf("班级考试平均分：%-5.2f",result);
	}

}
