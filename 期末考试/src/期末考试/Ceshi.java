package 期末考试;
interface Jie{
  void warn();
} 
abstract class Fu{
	abstract void Opendoor() ;
	abstract void Offdoor();
}
class Zi extends Fu implements Jie{
	public void  warn() {
		System.out.println("报警！！");
	}
	void Opendoor() {
		System.out.println("开门！");
	}
   void Offdoor() {
	   System.out.println("关门！！");
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
