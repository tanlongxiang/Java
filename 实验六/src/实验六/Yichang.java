package ʵ����;
import java.util.InputMismatchException;//�������������쳣����
import java.util.Scanner;
public class Yichang {
	public static void main(String[] args) {
		int n=0;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    double sum=0,aver=0;
	    try 
	    {
	if(n==0) //�ж��Ƿ���0
	{
		throw new Exception();//�ֶ��׳��쳣
	}

	try    //��׽�쳣
	    {
	 double a[]=new double[n];
     for(int i=0;i<=a.length-1;i++) 
     {
       a[i]=sc.nextDouble();
       sum=sum+a[i];
     }
    aver=sum/n;
    System.out.println("��ȷ");
    System.out.printf("aver=%.2f\n",aver);
       }
catch(InputMismatchException inputMismatchException) //���ó����Դ����쳣����������쳣���������Ͳ�ƥ���쳣
	{
	System.out.println("��ֵ����");
	}	
		}
	   catch(Exception e) {//�����Դ��쳣������쳣�������쳣��������
	    	System.out.println("��0����n���ܵ���0");
	    	}
	   
	   finally {
	    	System.out.println("�������"); 
	    	sc.close();
	          }	   
	}    
	}


