package 杂;
interface A1{
	public double PI=3.13;
	public  double area();
}

interface B1{
	public void setColor(String c);
}

interface C extends A1,B1{
public default void setColor(String c) {
		}
public default double area() {
		return 0;
}
default void volume() {
	}
	}

class Cylinder implements C{
	double radius;
	double height;
	String color;
	public Cylinder(double radius,double height,String color) {
		this.color=color;
		this.height=height;
		this.radius=radius;
	}
	public double area() {
		System.out.println("可以打印");
		return PI*radius*radius;
	}
	
	public void setColor(String c) {
		System.out.println(c);
	}
	public void volume() {
		System.out.print("圆柱体的体积："+(height*radius*radius));
		}
	}


public class TestCylinder {
	public static void main(String args[]) {
		Cylinder c=new Cylinder(1,2,"绿色");
		double i;
		i=c.area();
		System.out.println(i);
      //  c.setColor("绿色");
		//c.volume();
		
	}

}
