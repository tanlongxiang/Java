package 期末考试;
class Rectangle{
	double width;
	double height;
	 Rectangle(double w,double h) {
		width=w;
		height=h;
	}
	 void getArea() {
		 System.out.println("矩形的面积："+width*height);
	 }
	 void getZhouChang() {
		 System.out.println("矩形的周长："+2*(width+height));
	 }
}
public class CESHI1 {

	public static void main(String[] args) {
      Rectangle re=new Rectangle(5, 7);
      re.getArea();
      re.getZhouChang();

	}

}
