
class Account{
	 protected int id;                                  //为了让子类调用用protected
	 protected double annualInterestRate;
	 protected double balance;
	public Account(int id,double balance,double annualInterestRate) {//构造方法
		this.setId(id);                                                 //调用类中的方法
		this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
	}
	public int getId() {                     //get方法
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {      //set方法
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
		
	}
	
	public double getMonthlyInterest() {//获取月利率方法
		
		return this.annualInterestRate/12;			
	}
	public void withdraw(double amount) {         //取款方法
		System.out.println("预取款："+amount+"元");
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("取款成功\n"+"余额："+balance+"元");
		}
		else {
			System.out.println("对不起您的余额不足，取款失败\n"+"余额："+balance+"元");
			
		}
	}
	public void deposit(double anount) {    //存款方法
		balance=balance+anount;
		System.out.println("成功存入"+anount+"元\n"+"余额："+balance+"元\n"+"月利率："+getMonthlyInterest()+"%");
	}
}
class CheckAccout extends Account{   //子类继承父类
	double overdraft;                     //新的属性
	public CheckAccout(int id, double balance, double annualInterestRate,double overdraft) {//加入新的属性
		super(id, balance, annualInterestRate);//子类不能直接继承父类的构造方法要用super关键字
         this.overdraft=overdraft;
	}
	
	public void withdraw(double amount) {          //子类重写withdraw方法
		System.out.println("预取款："+amount+"元");
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("取款成功"+"余额："+balance+"元");
		}
		if(amount>balance){
			double touzhi=amount-balance;    //超出余额多少
			if(touzhi<=overdraft) {//与额度进行判断
				balance=0;
				overdraft=overdraft-touzhi;
				System.out.println("账户余额："+balance+"元   可透支额度："+overdraft+"元");
			}
			else {
				System.out.println("对不起，您超过可透支额的限额");
			}
			
		}
	}
} 
public class TestCheckAccount{
	public static void main(String[] args) {
	CheckAccout checkaccout=new CheckAccout(1122,20000,4.5,5000);//创建对象属于子类调用构造方法
	checkaccout.withdraw(5000);      //调用子类重写的方法
	checkaccout.withdraw(18000);
	checkaccout.withdraw(3000);
    } 
  }
/*public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account(1122,20000,4.5);//声明对象属于Account类调用构造方法
		account.withdraw(30000);//取款30000调用方法
		account.deposit(2500);//存款2500调用方法
		account.withdraw(3000);	//取款3000调用方法
	}

}*/

