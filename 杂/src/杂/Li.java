package ‘”;

import java.util.Scanner;
class T{
	double height1,wdith1;
	
	 T(double height1,double wdith1 ) {
		// TODO Auto-generated constructor stub
	   this.height1=height1;
	   this.wdith1=wdith1;
	}
	   double Ar() {
		return height1*wdith1;   
	   }
	   double Bi() {
		  return 2*(height1+wdith1);
	  }
}
public class Li {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height,wdith;
       Scanner scanner=new Scanner(System.in);
       height=scanner.nextDouble();
       wdith=scanner.nextDouble();
       T t=new T(height,wdith);
       System.out.println("mianji:"+t.Ar());
       System.out.println("bian£∫"+t.Bi());
	}

}
