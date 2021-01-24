package 期末考试;
class A {
	 A() {
		System.out.println("A的非默认构造方法！");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B的默认构造方法!!");
	   }
	 B(int a){
		System.out.println("B的非默认方法！"+a);
		}
}
public class CEshii {
	public static void main(String args[]) {
		B b=new B();
		B b2=new B(1);
	}

}
