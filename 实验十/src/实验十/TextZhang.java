package 实验十;
class ZhangBen{
	//账户余额属性
	private int  balance;
	//空构造方法
    public ZhangBen() {	}
    //传参数构造方法用于初始化
    public ZhangBen(int balance){this.balance=balance;}
    //设置账户金额方法
    public void setBalance(int balance) {this.balance=balance;}
    //获得账户金额方法
    public int getBlance() {return balance;}
    //存入取出方法
    public void saveOrTake(int amount) {
    //线程同步关键字
//    synchronized (this) {
    //用equals方法将当前线程的名字进行判断
    if(Thread.currentThread().getName().equals("会计存入")) 
    {   
        //for循环三次存钱三次 
    	for(int i=0;i<3;i++)
    	{
    		//存钱过程
    	int before=getBlance();
		int afther=before+amount;
		setBalance(afther);
		System.out.print(Thread.currentThread().getName()+amount+"万,账户上有"+getBlance()+"万");
		System.out.println("休息一会再存");	
		//sleep进行休息
		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	}
	}
       else 
        {
		for(int i=0;i<3;i++)
		{
			//取钱过程
		int before=getBlance();
		int afther=before-amount;
		setBalance(afther);
		System.out.print(Thread.currentThread().getName()+amount+"万,账户上有"+getBlance()+"万");
		System.out.println("休息一会再取");	
		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	 }
    	}
	    //            }
        }
}
//创建线程
class Account extends Thread{
	//声明账本对象
	private ZhangBen zhangBen;
	//构造方法传入账本类
    	public Account(ZhangBen zhangBen) 
    	{
    		this.zhangBen=zhangBen;
    	}
    	//重写run方法
		public void run() {
			//关键字同步方法括号里面要放线程共享对象
			  synchronized (zhangBen) {
				  //进行判断属于哪一个线程
			if(Thread.currentThread().getName().equals("会计存入"))
			{
				int amount=100;
				zhangBen.saveOrTake(amount);
		   }
			else {
  				int amount=50;
        	  zhangBen.saveOrTake(amount);
        	    }
			}
		}
		}
public class TextZhang {
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		//创建账户对象
         ZhangBen zhangben=new ZhangBen(200);
         //多态创建两个对象会计出纳共用一个账本
         Thread ac1=new Account(zhangben);
         Thread ac2=new Account(zhangben);
         //设置线程名字
         ac1.setName("会计存入");
         ac2.setName("出纳取出");
         //启动线程创建分支栈空间
         ac1.start();
         ac2.start();
	}

}
