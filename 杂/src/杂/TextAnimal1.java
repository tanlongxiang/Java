package ÔÓ;
class Animal_{
	public void eat() {
		System.out.println("³Ô¶«Î÷");
		}
	}
	interface D{
		public abstract void fly() ;
		}

class Bird  extends Animal_ implements D {
	public void fly() {
		System.out.println("Äñ¶ù·ÉÏè");
	}
	public void eat() {
		System.out.println("Äñ¶ù ³Ô³æ");
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
