class Cirlce{
	double radius;               //��������
 double	findArea(double radius){ //ʵ������ 
	return 3.14*radius*radius;   //����������ҷ���ֵ
}
}
 class PassObject {            
	
public void printAreas(Cirlce c,int time) {    //ʵ������ ����Cirlce����
	System.out.println("�뾶��  �����");
	for(int i=1;i<=time;i++) {            //����forѭ�����ҽ�forѭ���е�i��Ϊ�뾶ֵ	
  System.out.println(i+"      "+c.findArea(i));//����findArea������i����
	}	
}
}
public  class ShuChu{         
	 public static void main(String[] args) {
	 	Cirlce c=new Cirlce();               //������������CIrcle�࣬������������PassObject��
	 	PassObject b=new PassObject();
	 	b.printAreas(c,5);       //����printArea�������и�ֵ���
	 }

	 }