package �α�����;
import java.util.Scanner;
//public class �Ƚ����� {
//
//	public static void main(String[] args) {
////	int a[]= {1,8,5,74,67,8,7,9};
////	for(int i=0;i<a.length-1;i++) {//��������ǰ7����ÿһ��
////	 for(int j=i+1;j<a.length;j++)  //����������������һ����ÿһ��
////	{
////		      int temp=0;
////		if (a[i]>a[j]) {       //i=3�Ļ���Ƚ��±�Ϊ4--7��ÿһ�� ��Ϊjÿ�θ�ֵΪi��
////			
////			temp=a[i];
////			a[i]=a[j];
////			a[j]=temp;
////			
////		}
////		}
////			 
////	}  
////	for(int n:a) {
////			System.out.println(n);
////			}
////	for (int i=a.length-1;i>=0;i--) {
////		System.out.println(a[i]);
////	}
//		int a=0;
//		Scanner sc=new Scanner(System.in);
//		char a1=sc.next().charAt(1);
//		if(a1=='*') {
//			a=1;
//			System.out.println(a);
//		}
//		System.out.println(a);
//	}
//	
//}
public class �Ƚ����� {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��������Ҫ�·�");
int Season=sc.nextInt();
switch(Season) {
case 3:
case 4:
case 5:
	System.out.println("���·����������Ǵ���");
	break;
case 6:
case 7:
case 8:
	System.out.println("���·������������ļ�");
break;
case 9:
case 10:
case 11:
	System.out.println("���·������������＾");
break;
case 12:
case 1:
case 2:
	System.out.println("�ü��������ڶ���");
	break;

}
		sc.close();
	}

}


