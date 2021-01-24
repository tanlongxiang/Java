class GeometricObject{    //创建父类
	public String color;     
	public double weight;
	GeometricObject(String color,double weight){   //设置构造方法
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
	public double findArea() {   //返回面积方法
		return  0;
	}
	public void equalsArea(GeometricObject c) {      //动态绑定设置测试面积是否相等的方法
		if(findArea()==c.findArea()) {
			System.out.println("面积相等");
		}
		else System.out.println("面积不相等");
	}
	public void displayGeometricObject() {    //动态绑定设置面积输出方法
		System.out.println("面积："+findArea());
	}
}
class Circle1 extends GeometricObject{        //创建一个圆的子类属于父类
	public double radius;                 
    Circle1(double radius,String color,double weight){  //构造方法
    	super(color,weight);         //用super关键字调用父类构造方法
    	this.radius=radius;
    }
    public void setterRadius(double radius) {       
    	this.radius=radius;
    }
    public double getterRadius() {
    	return radius;
    }  
	public double findArea() {     //  重写父类方法返回面积方法
		return 3.14*radius*radius;
	}
}
class MyRectangle extends GeometricObject{       //创建矩形子类属于父类
	public double width;
	public double height;
	MyRectangle(double width,double height,String color,double weight){ //构造方法
		super(color,weight);    //同上 
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
	public double findArea() {//重写父类方法返回面积方法
		return width*height;
	}
}
public class TestGeo {

	public static void main(String[] args) {
		Circle1 a=new Circle1(5,"红",5);    //创建对象调用构造方法
		MyRectangle b=new MyRectangle(5,6,"黑",5);
	       a.equalsArea(b);              //调用继承父类的方法并且传递参数
	       System.out.print("圆的");
	       a.displayGeometricObject();
	       System.out.print("正方形");
	       b.displayGeometricObject();  
	       }
	}


