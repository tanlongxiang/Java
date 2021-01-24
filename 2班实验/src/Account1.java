
public class Account1 {
	private int id;                   //声明变量
	private double balance;    
	private double annualInterestRate;
public Account1(int id ,double balance,double annualInterestRate) {   //构造方法 无返回值
	 this.id=id;                                   //this当两个变量名字相同时用来特指上面变量
	 this.balance=balance;
	 this.annualInterestRate=annualInterestRate;
}
public int getId() {          //访问器方法 有返回值
	return id;
}
public double getBalance() {
	return balance;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setId( int id) { //实例方法进行传参数
	this.id=id;
}
public void setBalance(double balance) {
	this.balance=balance;
}
public void setAnnualInterestRate(double annualInterestRate) {
	this.annualInterestRate=annualInterestRate;
}
public void withdraw (double amount) {       //取款方法
	    System.out.println("取款"+amount+"元:");
	if(amount>balance) {                      //if语句进行判断取款金额
		System.out.println("余额不足，取款失败");
	}
	else {
		balance=balance-amount;                   //如果取款成功余额减去
		System.out.println("成功取款"+amount+"元");
	}
}
public void deposit (double amount) {            //存款方法类似上面取款方法
	    System.out.println("存入"+amount+"元：");
	    balance=balance+amount;          
	    System.out.println("成功存入"+amount+"元");
}
}
class Customer{                   
	private String firstName;         //声明私有变量
	private String lastName;
	private Account1 account;
	public  Customer(String firstName,String lastName) {//构造方法用来传递名字
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFirstName() {                 //实例方法返回名字
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account1 getAccount() {          //实例方法
		return account;
	}
	public void setAccount(Account1 account) {   //实例方法进行传参数
		this.account=account;
	}
}
class CeShi{
public static void main(String[] args) {
	Customer customer=new Customer("Jane", "Smith"); //创建对象属于类并且同时进行参数传递
	Account1 account=new Account1(1000,2000,1.23);
	account.deposit(100);                //调用方法将参数传入方法
	account.withdraw(960);
	account.withdraw(2000);
	System.out.println(	"\n"+"----基本信息----"+"\n"+"姓名："+customer.getFirstName()+" "+
	customer.getLastName()+"\n"+"账号："+" "+account.getId()+"\n"+"余额："+account.getBalance()+"\n"+
	"年利率为："+account.getAnnualInterestRate()+"%");           //调用方法打印出数据	
}
}