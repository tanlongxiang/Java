package 杂;
class Material{
	protected String name;
	protected double price;
	Material(String name ,double price){
	this.name=name;
	this.price=price;
	}
	 public String toString() {
		return "名称："+name+" 单价："+price+"\n";
	}
}
class Wood extends Material{
private String Color;
	Wood(String name, double price,String color) {
		super(name, price);
		// TODO Auto-generated constructor stub
	      Color=color;
	}
	public String toString() {
		return "名称："+name+" 单价："+price+" 颜色："+Color+"\n";
	}
}
public class TestMaterial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Wood wood =new Wood("白木",100,"白色");
          System.out.println( wood.toString());
	}

}
