package ��;
class Animal_{
	public void eat() {
		System.out.println("�Զ���");
		}
	}
	interface D{
		public abstract void fly() ;
		}

class Bird  extends Animal_ implements D {
	public void fly() {
		System.out.println("�������");
	}
	public void eat() {
		System.out.println("��� �Գ�");
	}
}
public class TextAnimal1 {
	public static void main(String args[]) {
	Animal_ b=new Bird();
	b.eat();
//	Bird a=(Bird) new Animal_();
//	a.eat();
//	a.fly();
	}

}
