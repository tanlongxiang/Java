package ½Ó¿Ú;

class Father{
	private String name ="zhangjun";
	class Child {
		 void introfather() {
			 System.out.println(name);
		 }
	}
}
public class TextIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Father.Child child=new Father().new Child();
       child.introfather();
       int a[][]=new int[3][4];
       System.out.println(a[2].length);
       System.out.println(a.length);
       System.out.println();
	}
}
