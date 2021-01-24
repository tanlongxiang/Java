import java.util.Scanner;
//import java.util.Arrays;
public class ShuZu {
	public static void main(String []args) {
	int a[]=new int[8];
		Scanner sc= new Scanner (System.in);
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}for(int c:a) {
	System.out.print(c);}
	for(int j=a.length-1;j>=0;j--) {
		System.out.print(a[j]);
	}
	System.out.println();
	sc.close();
	}
}

