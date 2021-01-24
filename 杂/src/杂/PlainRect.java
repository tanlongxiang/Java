package ��;
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
		//System.out.println("���ε�������"+(t.starX(10)+","+t.starY(10)));
		System.out.println("���ε������"+t.area());
		System.out.println("���ε������"+t.perimeter());
		
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
//	��1����дһ��������Rect��������
//
//	����protected���ԣ����εĿ�width�����εĸ�height��
//
//	�������췽����
//
//	1��һ���������������Ĺ��췽�������ڽ�width��height���Գ�����
//
//	2��һ�����������Ĺ��췽���������γ�ʼ��Ϊ��͸߶�Ϊ10��
//
//	����������
//
//	���������ķ���area()
//
//	������ܳ��ķ���perimeter()
//
//	��2��ͨ���̳�Rect���дһ������ȷ��λ�õľ�����PlainRect����ȷ��λ����
//
//	���ε����Ͻ���������ʶ��������
//
//	����������ԣ��������Ͻ�����startX��startY��
//
//	�������췽����
//
//	��4�������Ĺ��췽�������ڶ�startX��startY��width��height����
//
//	��ʼ����
//
//	���������Ĺ��췽���������γ�ʼ��Ϊ���Ͻ����ꡢ���Ϳ�Ϊ0
//
//	�ľ��Σ�
//
//	���һ��������
//
//	�ж�ĳ�����Ƿ��ھ����ڲ��ķ���isInside(double x,double y)�����ھ�
//
//	���ڣ�����true, ���򣬷���false��
//
//	  ��ʾ�����ھ�������ָ����������
//
//	x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)
//
//	��3����дPlainRect��Ĳ��Գ���
//
//	����һ�����Ͻ�����Ϊ��10��10������Ϊ20����Ϊ10�ľ��ζ���
//
//	���㲢��ӡ������ε�������ܳ���
//
//	�жϵ�(25.5��13)�Ƿ��ھ����ڣ�����ӡ��������Ϣ��*/
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//    PlainRec p=new PlainRec(10,10 ,10,20);
//    System.out.println(p.area());
//    System.out.println(p.perimeter());
//    System.out.println(p.isInside(25.5,13));
//	}
//
//}
