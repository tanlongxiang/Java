package 课本例题;
import java.util.Scanner;
//public class 比较数组 {
//
//	public static void main(String[] args) {
////	int a[]= {1,8,5,74,67,8,7,9};
////	for(int i=0;i<a.length-1;i++) {//遍历数组前7个的每一个
////	 for(int j=i+1;j<a.length;j++)  //遍历数组除了数组第一个的每一个
////	{
////		      int temp=0;
////		if (a[i]>a[j]) {       //i=3的话会比较下标为4--7的每一个 因为j每次赋值为i；
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
public class 比较数组 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你要月份");
int Season=sc.nextInt();
switch(Season) {
case 3:
case 4:
case 5:
	System.out.println("该月份所属季节是春季");
	break;
case 6:
case 7:
case 8:
	System.out.println("该月份所属季节是夏季");
break;
case 9:
case 10:
case 11:
	System.out.println("该月份所属季节是秋季");
break;
case 12:
case 1:
case 2:
	System.out.println("该季节所属于冬季");
	break;

}
		sc.close();
	}

}


