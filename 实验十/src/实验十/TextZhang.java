package ʵ��ʮ;
class ZhangBen{
	//�˻��������
	private int  balance;
	//�չ��췽��
    public ZhangBen() {	}
    //���������췽�����ڳ�ʼ��
    public ZhangBen(int balance){this.balance=balance;}
    //�����˻�����
    public void setBalance(int balance) {this.balance=balance;}
    //����˻�����
    public int getBlance() {return balance;}
    //����ȡ������
    public void saveOrTake(int amount) {
    //�߳�ͬ���ؼ���
//    synchronized (this) {
    //��equals��������ǰ�̵߳����ֽ����ж�
    if(Thread.currentThread().getName().equals("��ƴ���")) 
    {   
        //forѭ�����δ�Ǯ���� 
    	for(int i=0;i<3;i++)
    	{
    		//��Ǯ����
    	int before=getBlance();
		int afther=before+amount;
		setBalance(afther);
		System.out.print(Thread.currentThread().getName()+amount+"��,�˻�����"+getBlance()+"��");
		System.out.println("��Ϣһ���ٴ�");	
		//sleep������Ϣ
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
			//ȡǮ����
		int before=getBlance();
		int afther=before-amount;
		setBalance(afther);
		System.out.print(Thread.currentThread().getName()+amount+"��,�˻�����"+getBlance()+"��");
		System.out.println("��Ϣһ����ȡ");	
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
//�����߳�
class Account extends Thread{
	//�����˱�����
	private ZhangBen zhangBen;
	//���췽�������˱���
    	public Account(ZhangBen zhangBen) 
    	{
    		this.zhangBen=zhangBen;
    	}
    	//��дrun����
		public void run() {
			//�ؼ���ͬ��������������Ҫ���̹߳������
			  synchronized (zhangBen) {
				  //�����ж�������һ���߳�
			if(Thread.currentThread().getName().equals("��ƴ���"))
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
		//�����˻�����
         ZhangBen zhangben=new ZhangBen(200);
         //��̬�������������Ƴ��ɹ���һ���˱�
         Thread ac1=new Account(zhangben);
         Thread ac2=new Account(zhangben);
         //�����߳�����
         ac1.setName("��ƴ���");
         ac2.setName("����ȡ��");
         //�����̴߳�����֧ջ�ռ�
         ac1.start();
         ac2.start();
	}

}
