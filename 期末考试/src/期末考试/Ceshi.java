package ��ĩ����;
interface Jie{
  void warn();
} 
abstract class Fu{
	abstract void Opendoor() ;
	abstract void Offdoor();
}
class Zi extends Fu implements Jie{
	public void  warn() {
		System.out.println("��������");
	}
	void Opendoor() {
		System.out.println("���ţ�");
	}
   void Offdoor() {
	   System.out.println("���ţ���");
   }
} 
public class Ceshi {
    public static void main(String args[]) {
    	Zi zi=new Zi();
    	zi.warn();
    	zi.Opendoor();
    	zi.Offdoor();
    }
}
