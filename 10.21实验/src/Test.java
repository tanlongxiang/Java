class Ball{
    private double r;     //����˽�б���
    public void setR(double x) {  //���ð뾶����
    	r=x;
    }
    public double getR() {      //��ȡ�뾶����
    	return r;
    }
	
}
class Billiards extends Ball{
	private String color;           
	public void setCol(String col) {//������ɫ����
		color=col;
	}
	void show() {
		System.out.println("̨����ɫ��"+color+"\n"+"̨��뾶��"+getR());//�뾶�Ǹ���˽�б������ܱ��̳У�ֻ�ܵ��ü̳и����get�ķ���
	}
}
public class Test {

	public static void main(String[] args) {
		Billiards bi=new Billiards();//����һ�����������������Ĭ�Ϲ��췽��
		bi.setCol("��ɫ");//�������෽��
        bi.setR(15);//��������̳и���ķ���
        bi.show();//�������෽���������
	}

}
