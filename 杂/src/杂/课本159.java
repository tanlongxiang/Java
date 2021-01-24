package ÔÓ;
class A
{
	void f() 
	{
		char first='A',end='Z';
		for(char i=first;i<=end;i++)
		{
			System.out.print(i+" ");
		}
	}
}
class B extends A
{
	void g()
	{   
		//String c="5";
		char first1='¦Á',end1='¦Ø';
		char b=++first1;
		for(char i=first1;i<=end1;i++)
		{
			//System.out.print(i+" ");
			
		}System.out.println(b);
	}
}
public class ¿Î±¾159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            B b=new B();
           b.f();
           System.out.println();
           b.g();
	}

}
