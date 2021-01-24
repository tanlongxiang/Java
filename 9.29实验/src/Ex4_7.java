
public class Ex4_7 {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		Circle1 circle=new Circle1();
		Geometry geometry;
		geometry=new Geometry(rect,circle);
		geometry.setRectanglePosition(30,40);
		geometry.setRectangleWidthsAndHeight(120, 80);
		geometry.setCircle1Position(260, 30);
		geometry.setCircle1Radius(60);
		System.out.print("几何图形中圆和矩形的位置关系是：");
		geometry.showState();
		System.out.println("几何图形重新调整了圆和矩形的位置。");
		geometry.setRectanglePosition(220,160);
		geometry.setCircle1Position(40, 30);
		System.out.print("调整后，几何图形中圆和矩形的位置关系是：");
		geometry.showState();
	}

}
