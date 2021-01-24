package ʵ����;
import java.util.*;
interface ComputerAverage{           //�ӿڵ����� 
	public double average(double x[]);     //дһ�����󷽷�
}
class Gymnastics implements ComputerAverage{      //�����������Լ�ʵ�ֽӿ� 
	public double average(double x[])              //��д�ӿ�����ĳ��󷽷�  
	{   
		Arrays.sort(x);        //�������򷽷�
	    double sum=0;             
	    if(x.length>2)          //�ж����鳤���Ƿ����2
 {
		for(int i=1;i<x.length-1;i++) //����for���������ڶ�λ�������ڶ�λ�ĺ�
		{
			    sum=sum+x[i];
		}
		return sum/(x.length-2);        //����ƽ��ֵ
 }
	    else  return sum=0;
		
	}
}
class School implements ComputerAverage{   
	public double average(double x[]) {  //��д�ӿ��еĳ��󷽷�
	    double sum=0;
	    for(int i=0;i<x.length;i++)       //����forѭ����������
	    {
	    	sum=sum+x[i];
	    }
	    return sum/x.length;//��ƽ��ֵ
   }
}
public class Estimator {
     
	public static void main(String[] args) {
	     double a[]={9.89,9.88,9.99,9.12,9.69,9.76,8.97};
	     double b[]={89,56,78,90,100,77,56,45,36,79,98};
         ComputerAverage computer;       //����ComputerAverage�ӿڵĶ���
         computer=new Gymnastics();     //computer��ΪGymnastics����ת�Ͷ���
         double result=computer.average(a);  //���÷����������ֵ��result
         System.out.printf("%n");                                    
         System.out.printf("���ѡ�����÷֣�%5.3f\n",result);
         computer=new School();             
         result=computer.average(b);
         System.out.printf("�༶����ƽ���֣�%-5.2f",result);
	}

}
