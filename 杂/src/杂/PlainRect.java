package 杂;
class Rect{
	 int width;
	 int height;
	public Rect(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public Rect() {
		this.width=10;
		this.height=10;
	}
}
	class TestPlainRect extends Rect{
		double startX;
		double startY;
		public TestPlainRect(int width,int height,double startX,double startY) {
			super(width,height);
			this.startX=startX;
			this.startY=startY;
		}
		public TestPlainRect() {
			this.width=0;
			this.height=0;
			this.startX=0;
			this.startY=0;
		}
		public double area() {
			return width*height;
		}
		public double perimeter() {
			return 2*(width+height);
		}
		public boolean isInside(double x,double y) {
			if(x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
	}

public class PlainRect {
	public static void main(String args[] ) {
		// TODO Auto-generated method stub
		TestPlainRect t=new TestPlainRect(20,10,10,10);
		//System.out.println("矩形的坐标是"+(t.starX(10)+","+t.starY(10)));
		System.out.println("矩形的面积是"+t.area());
		System.out.println("矩形的体积是"+t.perimeter());
		
	}

}

//class Rect{
//	protected double width;
//	protected double height;
//	public  Rect(double width,double height) {
//		this.height=height;
//		this.width=width;
//	}
//	public Rect() {
//		// TODO Auto-generated constructor stub
//	this.height=10;
//	this.width=10;
//	}
//	double area() {
//		return height*width;
//	}
//	double perimeter() {
//		return 2*(height*width);
//	}
//}
//class PlainRec extends Rect{
//	double startX;
//	double startY;
//	public PlainRec(double startX,double startY,double width,double height) {
//		// TODO Auto-generated constructor stub
//	   super(width,height);
//	   this.startX=startX;
//	   this.startY=startY;
//	   
//	}
//	public PlainRec() {
//		// TODO Auto-generated constructor stub
//	this.startX=0;
//	this.startY=0;
//	this.height=0;
//	this.width=0;
//	}
//	boolean isInside(double x,double y) {
//		
//		if(x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)) {
//			return true ;
//			
//		}
//		else     
//			return false;
//	}
//	
//}
//public class PlainRect {
///**
//	（1）编写一个矩形类Rect，包含：
//
//	两个protected属性：矩形的宽width；矩形的高height。
//
//	两个构造方法：
//
//	1．一个带有两个参数的构造方法，用于将width和height属性初化；
//
//	2．一个不带参数的构造方法，将矩形初始化为宽和高都为10。
//
//	两个方法：
//
//	求矩形面积的方法area()
//
//	求矩形周长的方法perimeter()
//
//	（2）通过继承Rect类编写一个具有确定位置的矩形类PlainRect，其确定位置用
//
//	矩形的左上角坐标来标识，包含：
//
//	添加两个属性：矩形左上角坐标startX和startY。
//
//	两个构造方法：
//
//	带4个参数的构造方法，用于对startX、startY、width和height属性
//
//	初始化；
//
//	不带参数的构造方法，将矩形初始化为左上角坐标、长和宽都为0
//
//	的矩形；
//
//	添加一个方法：
//
//	判断某个点是否在矩形内部的方法isInside(double x,double y)。如在矩
//
//	形内，返回true, 否则，返回false。
//
//	  提示：点在矩形类是指满足条件：
//
//	x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)
//
//	（3）编写PlainRect类的测试程序
//
//	创建一个左上角坐标为（10，10），长为20，宽为10的矩形对象；
//
//	计算并打印输出矩形的面积和周长；
//
//	判断点(25.5，13)是否在矩形内，并打印输出相关信息。*/
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    PlainRec p=new PlainRec(10,10 ,10,20);
//    System.out.println(p.area());
//    System.out.println(p.perimeter());
//    System.out.println(p.isInside(25.5,13));
//	}
//
//}
