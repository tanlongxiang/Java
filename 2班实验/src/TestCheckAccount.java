
class Account{
	 protected int id;                                  //Ϊ�������������protected
	 protected double annualInterestRate;
	 protected double balance;
	public Account(int id,double balance,double annualInterestRate) {//���췽��
		this.setId(id);                                                 //�������еķ���
		this.setBalance(balance);
        this.setAnnualInterestRate(annualInterestRate);
	}
	public int getId() {                     //get����
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {      //set����
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
		
	}
	
	public double getMonthlyInterest() {//��ȡ�����ʷ���
		
		return this.annualInterestRate/12;			
	}
	public void withdraw(double amount) {         //ȡ���
		System.out.println("Ԥȡ�"+amount+"Ԫ");
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("ȡ��ɹ�\n"+"��"+balance+"Ԫ");
		}
		else {
			System.out.println("�Բ����������㣬ȡ��ʧ��\n"+"��"+balance+"Ԫ");
			
		}
	}
	public void deposit(double anount) {    //����
		balance=balance+anount;
		System.out.println("�ɹ�����"+anount+"Ԫ\n"+"��"+balance+"Ԫ\n"+"�����ʣ�"+getMonthlyInterest()+"%");
	}
}
class CheckAccout extends Account{   //����̳и���
	double overdraft;                     //�µ�����
	public CheckAccout(int id, double balance, double annualInterestRate,double overdraft) {//�����µ�����
		super(id, balance, annualInterestRate);//���಻��ֱ�Ӽ̳и���Ĺ��췽��Ҫ��super�ؼ���
         this.overdraft=overdraft;
	}
	
	public void withdraw(double amount) {          //������дwithdraw����
		System.out.println("Ԥȡ�"+amount+"Ԫ");
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("ȡ��ɹ�"+"��"+balance+"Ԫ");
		}
		if(amount>balance){
			double touzhi=amount-balance;    //����������
			if(touzhi<=overdraft) {//���Ƚ����ж�
				balance=0;
				overdraft=overdraft-touzhi;
				System.out.println("�˻���"+balance+"Ԫ   ��͸֧��ȣ�"+overdraft+"Ԫ");
			}
			else {
				System.out.println("�Բ�����������͸֧����޶�");
			}
			
		}
	}
} 
public class TestCheckAccount{
	public static void main(String[] args) {
	CheckAccout checkaccout=new CheckAccout(1122,20000,4.5,5000);//������������������ù��췽��
	checkaccout.withdraw(5000);      //����������д�ķ���
	checkaccout.withdraw(18000);
	checkaccout.withdraw(3000);
    } 
  }
/*public class TestAccount {

	public static void main(String[] args) {
		Account account=new Account(1122,20000,4.5);//������������Account����ù��췽��
		account.withdraw(30000);//ȡ��30000���÷���
		account.deposit(2500);//���2500���÷���
		account.withdraw(3000);	//ȡ��3000���÷���
	}

}*/

