package 杂;
class Fu{
	String die="爹的";
	void fangfa() 
	{
		System.out.println("父类的");
	}
}
class Zi extends Fu{
	String die="儿子的";
	String er="儿子";
	void fangfa()
	{
		System.out.println("子类的");
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
