package ½Ó¿Ú;
class Order{
	int orderld =1;
	String Olrdername;
	void setOrderld(int orderld) {
		this.orderld=orderld;
	}
	int getOrderld() {
		return orderld;
	}
	void setOldername(String oldername) {
		Olrdername=oldername;
	}
	String getOldername() {
		return Olrdername;
	}
	public Order(int orderld,String orderName) {
		// TODO Auto-generated constructor stub
	super();
	this.orderld=orderld;
	this.Olrdername=orderName;
	}
//	public boolean equals(Object obj) {
//		if(this==obj) {return true;}
//		else if (obj instanceof Order) {
//			Order o=(Order)obj;
//			return this.orderld==o.orderld&&this.Olrdername==o.Olrdername;
//		}
//		else {return false;}
	//}
}
public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Order o1=new Order(1000,"AAA");
        Order o2=new Order(1000, "AAA");
        System.out.println(o1==o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.orderld==o2.orderld);
        System.out.println(o1.orderld);
        byte b='a';
        //b=b;
        b=(byte) (b+1);
        while(b<100) {
        	if(b==70) {
           b=b++;
        		continue;
           
        		
        }
        }
	}

}
