package ʵ����;
interface IShape{         //�ӿڵ�����
	public double area();   //�������󷽷�
}
class square implements IShape{   //�����������Լ�ʵ�ֽӿ�
	double bian;         
	square(double a){           // ���췽����ʼ���߳�
		bian=a;
	}
	public double area() {   //��д�ӿ��еĳ��󷽷�
		return bian*bian;    //�������  
	}
}
public class TestSquare {

	public static void main(String[] args) {
		square sq=new square(12.5);          //����square��ĵ��ù��췽��
		System.out.println("�����������"+sq.area());
	}

}
