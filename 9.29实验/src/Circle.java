class Circle {
	double r;                //成员变量
	void setR(double r) {    
	   this.r=r;             //设出相同名字的变量时this使r指向成员变量
	}
	public double getArea() {    //实列方法 
		return r*r*Math.PI;     //return返回结果
	}
	public double getPerimeter() {
		return 2*Math.PI*r;      
	}
	public static void main(String[] args) {
		Circle circle1=new Circle();   //创建两个对象这两个对象属于Circle类
		Circle circle2=new Circle();
		circle1.setR(2.0);            //调用方法为半径赋值
		circle2.setR(3.0);
   System.out.println("circle1的面积："+circle1.getArea());
   System.out.println("circle2的面积："+circle2.getArea());
   System.out.println("circle1的周长："+circle1.getPerimeter());
   System.out.println("circle2的周长："+circle2.getPerimeter());
	}
}
