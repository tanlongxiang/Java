
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
		System.out.print("����ͼ����Բ�;��ε�λ�ù�ϵ�ǣ�");
		geometry.showState();
		System.out.println("����ͼ�����µ�����Բ�;��ε�λ�á�");
		geometry.setRectanglePosition(220,160);
		geometry.setCircle1Position(40, 30);
		System.out.print("�����󣬼���ͼ����Բ�;��ε�λ�ù�ϵ�ǣ�");
		geometry.showState();
	}

}
