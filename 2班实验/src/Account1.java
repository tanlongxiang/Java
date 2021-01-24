
public class Account1 {
	private int id;                   //��������
	private double balance;    
	private double annualInterestRate;
public Account1(int id ,double balance,double annualInterestRate) {   //���췽�� �޷���ֵ
	 this.id=id;                                   //this����������������ͬʱ������ָ�������
	 this.balance=balance;
	 this.annualInterestRate=annualInterestRate;
}
public int getId() {          //���������� �з���ֵ
	return id;
}
public double getBalance() {
	return balance;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setId( int id) { //ʵ���������д�����
	this.id=id;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate=annualInterestRate;
}
public void withdraw (double amount) {       //ȡ���
	    System.out.println("ȡ��"+amount+"Ԫ:");
	if(amount>balance) {                      //if�������ж�ȡ����
		System.out.println("���㣬ȡ��ʧ��");
	}
	else {
		balance=balance-amount;                   //���ȡ��ɹ�����ȥ
		System.out.println("�ɹ�ȡ��"+amount+"Ԫ");
	}
}
public void deposit (double amount) {            //������������ȡ���
	    System.out.println("����"+amount+"Ԫ��");
	    balance=balance+amount;          
	    System.out.println("�ɹ�����"+amount+"Ԫ");
}
}
class Customer{                   
	private String firstName;         //����˽�б���
	private String lastName;
	private Account1 account;
	public  Customer(String firstName,String lastName) {//���췽��������������
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {                 //ʵ��������������
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account1 getAccount() {          //ʵ������
		return account;
	}
	public void setAccount(Account1 account) {   //ʵ���������д�����
		this.account=account;
	}
}
class CeShi{
public static void main(String[] args) {
	Customer customer=new Customer("Jane", "Smith"); //�������������ಢ��ͬʱ���в�������
	Account1 account=new Account1(1000,2000,1.23);
	account.deposit(100);                //���÷������������뷽��
	account.withdraw(960);
	account.withdraw(2000);
	System.out.println(	"\n"+"----������Ϣ----"+"\n"+"������"+customer.getFirstName()+" "+
	customer.getLastName()+"\n"+"�˺ţ�"+" "+account.getId()+"\n"+"��"+account.getBalance()+"\n"+
	"������Ϊ��"+account.getAnnualInterestRate()+"%");           //���÷�����ӡ������	
}
}