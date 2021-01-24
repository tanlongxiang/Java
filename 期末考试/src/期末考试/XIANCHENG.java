package 期末考试;
class Fenzhi implements Runnable{
	  public void run(){
		for(int i=20;i>0;i--) {
			System.out.println("分支线程："+i);
		}
		System.out.println("分支线程结束");
	}
}
public class XIANCHENG {
	public static void main(String[] args) {
	      Fenzhi fenzhi=new Fenzhi();
	      Thread thread=new Thread(fenzhi);
	      thread.start();
	      for(int i=20;i>0;i--) {
				System.out.println("主线程："+i);
			}
	      System.out.println("主线程结束");
	}

}
