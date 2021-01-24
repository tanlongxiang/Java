class Animal{
	private String name;//����˽�б���
	void cry() {        //�������������
		System.out.println("������");
	}
	public void setAnimalName(String name) {//���ö������ֵķ���
		this.name=name;
	}
	public String getAnimalName(){    //��ȡ�������ֵķ���
		return name;
	}
}
class Simulator{               //����ģ������
	Animal animal;         //����Animal��
   public void playSound(Animal animal){//����ת��Ϊ��ת�Ͷ���
		animal.cry();           //������ת�Ͷ���ķ���
	}
}
class Dog extends Animal{//����Dog��̳и���
	public void cry() {  //��дcry����
		setAnimalName("��");// ���ø���set����
		System.out.println(getAnimalName()+"\n"+"���У�������");
	}
}
class Cat extends Animal{//ͬ����Dog��
	public void cry() {
		 setAnimalName("è");
		System.out.println(getAnimalName()+"\n"+"è�У�������");
	}	
}
public class Application {

	public static void main(String[] args) {
		Simulator simulator=new Simulator();//������������Simulator�����Ĭ�ϵĹ��췽��
		simulator.playSound(new Dog());     //��new Dog�������� Animal animal animal��Dog����ת�Ͷ���
		simulator.playSound(new Cat());
	}

}
