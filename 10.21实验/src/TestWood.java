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
		return "�������ƣ�"+name+"   ���ϵ��ۣ�"+price;
	}
}
class Wood extends Material{
   private String col;
   Wood(String name,double price,String col){
	   super(name,price);
	   this.col=col;
   }
   public String toString() {
	   return "ľ�����ƣ�"+name+"   ľ�ĵ��ۣ�"+price+"   ľ����ɫ��"+col;
   }
}
public class TestWood {
	public static void main(String[] args) {
		Material a=new Material("�װ�",12);
		Wood b=new Wood("��ľ",15,"��");
		System.out.println(a.toString());
		System.out.println(b.toString());
		a=b;
		System.out.println(a.toString());
		
	}

}
