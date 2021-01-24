class GeometricObject{    //��������
	public String color;     
	public double weight;
	GeometricObject(String color,double weight){   //���ù��췽��
		this.color=color;
		this.weight=weight;
	}
	public void setterColor(String color) {      
	    this.color=color;
	}
	public void setterWeight(double weight) {
		this.weight=weight;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public double findArea() {   //�����������
		return  0;
	}
	public void equalsArea(GeometricObject c) {      //��̬�����ò�������Ƿ���ȵķ���
		if(findArea()==c.findArea()) {
			System.out.println("������");
		}
		else System.out.println("��������");
	}
	public void displayGeometricObject() {    //��̬����������������
		System.out.println("�����"+findArea());
	}
}
class Circle1 extends GeometricObject{        //����һ��Բ���������ڸ���
	public double radius;                 
    Circle1(double radius,String color,double weight){  //���췽��
    	super(color,weight);         //��super�ؼ��ֵ��ø��๹�췽��
    	this.radius=radius;
    }
    public void setterRadius(double radius) {       
    	this.radius=radius;
    }
    public double getterRadius() {
    	return radius;
    }  
	public double findArea() {     //  ��д���෽�������������
		return 3.14*radius*radius;
	}
}
class MyRectangle extends GeometricObject{       //���������������ڸ���
	public double width;
	public double height;
	MyRectangle(double width,double height,String color,double weight){ //���췽��
		super(color,weight);    //ͬ�� 
		this.width=width;
		this.height=height;
	}
	public void setterWidth(double width) {
		this.width=width;
	}
	public void setterHeight(double height) {
		this.height=height;
	}
	public double getterWidth() {
		return width;
	}
	public double getterHeight() {
		return height;
	}
	public double findArea() {//��д���෽�������������
		return width*height;
	}
}
public class TestGeo {

	public static void main(String[] args) {
		Circle1 a=new Circle1(5,"��",5);    //����������ù��췽��
		MyRectangle b=new MyRectangle(5,6,"��",5);
	       a.equalsArea(b);              //���ü̳и���ķ������Ҵ��ݲ���
	       System.out.print("Բ��");
	       a.displayGeometricObject();
	       System.out.print("������");
	       b.displayGeometricObject();  
	       }
	}


