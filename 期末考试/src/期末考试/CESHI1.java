package ��ĩ����;
class Rectangle{
	double width;
	double height;
	 Rectangle(double w,double h) {
		width=w;
		height=h;
	}
	 void getArea() {
		 System.out.println("���ε������"+width*height);
	 }
	 void getZhouChang() {
		 System.out.println("���ε��ܳ���"+2*(width+height));
	 }
}
public class CESHI1 {

	public static void main(String[] args) {
      Rectangle re=new Rectangle(5, 7);
      re.getArea();
      re.getZhouChang();

	}

}
