class Material{
	protected String name;
	protected double price;
	Material(String name,double price){
		this.name=name;
		this.price=price;
	}
	public String get() {
		return name;
	}
	public String toString() {
		return "第蹋靡備ㄩ"+name+"   第蹋等歎ㄩ"+price;
	}
}
class Wood extends Material{
   private String col;
   Wood(String name,double price,String col){
	   super(name,price);
	   this.col=col;
   }
   public String toString() {
	   return "躂第靡備ㄩ"+name+"   躂第等歎ㄩ"+price+"   躂第晇伎ㄩ"+col;
   }
}
public class TestWood {
	public static void main(String[] args) {
		Material a=new Material("啞啣",12);
		Wood b=new Wood("啞躂",15,"啞");
		System.out.println(a.toString());
		System.out.println(b.toString());
		a=b;
		System.out.println(a.toString());
		
	}

}
