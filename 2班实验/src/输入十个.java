//import java.util.Scanner;
public class ����ʮ�� {

	public static void main(String[] args) {
//		int a[]=new int[10];    //��������
//		Scanner sc=new Scanner(System.in);//�Ӽ�������
//		for(int i=0;i<10;i++) {
//			a[i]=sc.nextInt();//���������ֵ������
//			}
//			for(int n:a) {
//				System.out.print(n+" " );
//			}
//			int max=a[0];
//			int min=a[0];
//			float sum=0;
//			for(int i=0;i<a.length;i++) {
//				if(max<a[i]) {	//�ж������ÿһ�����Ĵ�С����max����pkֻҪ��max�󶼸�ֵ��max
//					max=a[i];
//				}
//				if(min>a[i]) {//ͬ�����max
//					min=a[i];
//				}
//				sum=sum+a[i]; 
//			}
//			System.out.println("\n"+max);
//			System.out.println(min);
//			System.out.println(sum);
//			System.out.println(sum/a.length);
//			
//			//+"\n"+s
//			sc.close();
//		int n=0,sum=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("��Ҫ����ٸ����ĺ�?������");
//		n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("�����������Щ�����Կո����");
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//			System.out.print(a[i]+" ");
//			sum=sum+a[i];
//		}
//		System.out.println();
//		System.out.println(sum);
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"=");
				System.out.print(i*j+" ");
				if(i==j) {
				System.out.println();}
			}
		}
		
	}

}
