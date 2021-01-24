package ÊµÑéÊ®;
import java.util.Scanner;
 class Xiancheng implements Runnable{
        int n;
        Xiancheng(int n){this.n=n;}
	public void run() {
		for(int i=n;i>=0;i--) {
			System.out.println(i);
			try {Thread.sleep(500);}
			catch (InterruptedException e) {}
		}
	}
	
}
public class Test_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Xiancheng xiancheng=new Xiancheng(n);  
		Thread xian=new Thread(xiancheng);
		xian.start();
		sc.close();
	}

}
