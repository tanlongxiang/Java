class Circle {
	double r;                //��Ա����
	void setR(double r) {    
	   this.r=r;             //�����ͬ���ֵı���ʱthisʹrָ���Ա����
	}
	public double getArea() {    //ʵ�з��� 
		return r*r*Math.PI;     //return���ؽ��
	}
	public double getPerimeter() {
		return 2*Math.PI*r;      
	}
	public static void main(String[] args) {
		Circle circle1=new Circle();   //��������������������������Circle��
		Circle circle2=new Circle();
		circle1.setR(2.0);            //���÷���Ϊ�뾶��ֵ
		circle2.setR(3.0);
   System.out.println("circle1�������"+circle1.getArea());
   System.out.println("circle2�������"+circle2.getArea());
   System.out.println("circle1���ܳ���"+circle1.getPerimeter());
   System.out.println("circle2���ܳ���"+circle2.getPerimeter());
	}
}
