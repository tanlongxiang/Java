package ��;
abstract class Animal3{
	abstract void cry();
     abstract void getAnimaName();
} 
class Simulator {
	Animal3 animal;
	void playSound(Animal3 animal) {
		animal.getAnimaName();
		animal.cry();
	}
}
class Dog1 extends Animal3{

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("�������У�");
	}

	@Override
	void getAnimaName() {
		// TODO Auto-generated method stub
		System.out.println("��èѽ��");
	}
	
}
class Cat1 extends Animal3{

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("è�����У�");
	}

	@Override
	void getAnimaName() {
		// TODO Auto-generated method stub
		System.out.println("�ǹ�ѽ��");
	}
	
}
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Simulator simulator=new Simulator();
      simulator.playSound(new Dog1());
      simulator.playSound(new Cat1());
	}

}
