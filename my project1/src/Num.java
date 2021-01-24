import java.util.Scanner;

class crile{
	double r;  //声明变量
	void setR(double R) {}//设置半径
	double getA() {
		return 0;       //既然都设置半径了那就能得到面积了
	}
}

public class Num {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double Ri=sc.nextDouble();
		crile  Crile=new crile();//创建对象等下调用他的方法
		Crile.setR(Ri);//调用上面的设置半径方法把Ri的值传给R
		
		System.out.println(Crile.getA());   //Cricle.getA()就是得到面积的方法
		sc.close();
	}
}















//	System.out.println("输入八个数字：");	
//	Scanner sc=new Scanner(System.in);//从键盘输入
//	int a[]=new int[8];//定义一个数组
//	for(int i=0;i<8;i++) {//for循环
//	a[i]=sc.nextInt();}//键盘输入的赋值给数组
//	System.out.println("输出原数组：");
//	for(int n:a) {//for each语句
//		System.out.print(n+" ");
//	}
//	System.out.println();
//	System.out.println("输出逆数组:");
//	for(int m=a.length-1;m>=0;m--) {//for循环
//      System.out.print(a[m]+" ");	
//	sc.close();
//	}
//	}
//	}

