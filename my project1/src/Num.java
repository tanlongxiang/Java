import java.util.Scanner;

class crile{
	double r;  //��������
	void setR(double R) {}//���ð뾶
	double getA() {
		return 0;       //��Ȼ�����ð뾶���Ǿ��ܵõ������
	}
}

public class Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double Ri=sc.nextDouble();
		crile  Crile=new crile();//����������µ������ķ���
		Crile.setR(Ri);//������������ð뾶������Ri��ֵ����R
		
		System.out.println(Crile.getA());   //Cricle.getA()���ǵõ�����ķ���
		sc.close();
	}
}















//	System.out.println("����˸����֣�");	
//	Scanner sc=new Scanner(System.in);//�Ӽ�������
//	int a[]=new int[8];//����һ������
//	for(int i=0;i<8;i++) {//forѭ��
//	a[i]=sc.nextInt();}//��������ĸ�ֵ������
//	System.out.println("���ԭ���飺");
//	for(int n:a) {//for each���
//		System.out.print(n+" ");
//	}
//	System.out.println();
//	System.out.println("���������:");
//	for(int m=a.length-1;m>=0;m--) {//forѭ��
//      System.out.print(a[m]+" ");	
//	sc.close();
//	}
//	}
//	}

