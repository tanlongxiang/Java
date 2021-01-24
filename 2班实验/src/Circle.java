
import java.util.Scanner;

public class Circle {
	static double radius;
	   
	public double findArea(double radius) {
		return 3.14*radius*radius;
	}
	
public void main(String[] args){
	System.out.println("请输入半径：");
	Scanner r=new Scanner(System.in);
	Circle z = new Circle();
	radius=r.nextDouble();
	System.out.println("圆的面积是："+z.findArea(radius));
	 r.close();

}
}
