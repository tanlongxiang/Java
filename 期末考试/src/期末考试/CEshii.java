package ��ĩ����;
class A {
	 A() {
		System.out.println("A�ķ�Ĭ�Ϲ��췽����");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("B��Ĭ�Ϲ��췽��!!");
	   }
	 B(int a){
		System.out.println("B�ķ�Ĭ�Ϸ�����"+a);
		}
}
public class CEshii {
	public static void main(String args[]) {
		B b=new B();
		B b2=new B(1);
	}

}
