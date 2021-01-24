package ½Ó¿Ú;
abstract class AAAA{
	abstract void ccc();
}
interface A{
	void set1();
	void set2();
}
interface B extends A{
	abstract void set3();
}
class C implements B{
	public void set1() {}
//	void set2() {}
//	void set3() {}

	@Override
	public void set2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set3() {
		// TODO Auto-generated method stub
		
	}
}
public class LI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
