package ��ĩ����;
class Fenzhi implements Runnable{
	  public void run(){
		for(int i=20;i>0;i--) {
			System.out.println("��֧�̣߳�"+i);
		}
		System.out.println("��֧�߳̽���");
	}
}
public class XIANCHENG {
	public static void main(String[] args) {
	      Fenzhi fenzhi=new Fenzhi();
	      Thread thread=new Thread(fenzhi);
	      thread.start();
	      for(int i=20;i>0;i--) {
				System.out.println("���̣߳�"+i);
			}
	      System.out.println("���߳̽���");
	}

}
