//import java.util.Scanner;
public class 输入十个 {

	public static void main(String[] args) {
//		int a[]=new int[10];    //声明数组
//		Scanner sc=new Scanner(System.in);//从键盘输入
//		for(int i=0;i<10;i++) {
//			a[i]=sc.nextInt();//输入的数赋值给数组
//			}
//			for(int n:a) {
//				System.out.print(n+" " );
//			}
//			int max=a[0];
//			int min=a[0];
//			float sum=0;
//			for(int i=0;i<a.length;i++) {
//				if(max<a[i]) {	//判断数组的每一个数的大小，用max进行pk只要比max大都赋值给max
//					max=a[i];
//				}
//				if(min>a[i]) {//同上面的max
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
//		System.out.println("你要求多少个数的和?请输入");
//		n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("请具体输入这些数，以空格隔开");
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
