package ��;


class A12 {
	void C()                       //�շ���û�з�������//�����û�з��ص��Ƕ���
	{
		System.out.println("daying");   //�������д�ӡ�� 
	}
	
   int B(int i) {       //�����͵ķ����������ִ����֮���returnһ��ֵ��int
	  //�������б�Ķ��� Ҳ��ִ��
	   //�����Դ�ӡ����
	  // System.out.println("1");//��������͵ķ���������ԷŴ�ӡ  ����û����仰��Ҳ����������ִ��һ��
	   return i*i; 
   }
   
}
public class leixing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int p;
		A12 a=new A12();
//          a.B(1);        //���о���ֵ��     //�����ִ��   ֻ������û�ж����ǿյĶ���
//         p=a.B(2);
//          //����൱�ھ���ֵ �������������  
//          a.C();
//          System.out.println(a.B(1)+p);//������ǿ��Դ�ӡ  ����ӡֻ��ִ����retrun�Ľ��   
          //���ڴ�ӡ������ӡ������� return i*i; 
	        //������������
	      //����   Ӧ������ʾ��������     ��û���������Բ�Ҫ��ӡ�õ�ʱ��ֱ�Ӷ���dian����
	      a.C();   
	}

}
