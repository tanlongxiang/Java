package ʵ����;

class Fan{	            //���� 
	public int f (int a,int b)  //���Լ������
	{   

		for(int i=a;i>0;i--)    //��forѭ��
		   {
			if(a%i==0&&b%i==0)//���a,b���ܳ����򷵻�i��ֵ��
			{
				return i;
			}
	      }
	    
		return 0;
   }
         }
class Fanson extends Fan{             //��������̳и���
	public int f (int a, int b)   //��д���෽����С����������
	{
		 int m=super.f(a, b);     //��super�ؼ��ֵ��ø������ط�����ֵ����m
		return a*b/m;                //������С������
	}
                        }
public class Test {

	public static void main(String[] args) {
		     Fan fan=new Fan();          //�������෽�����ù��췽��
		     System.out.println("���Լ����"+fan.f(12,6));
		     fan=new Fanson();            //���������Ϊ������ת�Ͷ���
             System.out.println("��󹫱�����"+fan.f(12,6));
	}

}
