package ��;
class Fu{
	String die="����";
	void fangfa() 
	{
		System.out.println("�����");
	}
}
class Zi extends Fu{
	String die="���ӵ�";
	String er="����";
	void fangfa()
	{
		System.out.println("�����");
	}
}
public class zhuang {
	public static void main(String[] args) {
         Zi zi=new Zi();
         Fu fu=zi;
         System.out.println(fu.die);
         fu.fangfa();
	}
      
}
