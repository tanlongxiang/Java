package ʵ��ʮ;

import java.util.Random;
//���������߳�
class XianCheng_1 implements Runnable{
//�������������
	Random random=new Random();
	//��дrun����
public void run() {
		for(int i=0;i<10;i++) {
	      System.out.println("��ʼִ�е�a���̣߳�"+i);
	      try {
	    	  //���߲���10ms
			Thread.sleep(random.nextInt(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("a�߳̽�����");
	}
}
class XianCheng_2 implements Runnable{
	Random random=new Random();
public void run() {
		for(int i=0;i<10;i++) {
	      System.out.println("��ʼִ�е�b���̣߳�"+i);
	      try {
			Thread.sleep(random.nextInt(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("b�߳̽�����");
	}
}
public class TestThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("main�����ĵ��߳̿�ʼ");
           //����ʵ�ֽӿ���Ķ���
           XianCheng_1 xian1=new XianCheng_1();
           XianCheng_2 xian2=new XianCheng_2();
           // ��̬  ����Щ�������Thread����������start����
           Thread a=new Thread(xian1);
           Thread b=new Thread(xian2);
           //�����߳� �����̻߳��Զ�����run����
           a.start();
           b.start();
           //��һ����ʱ�۲�������
           for(int i=10000;i>0;i--) 
        	   for(int j=10000;j>0;j--);
           System.out.println("main�����߳̽�����");
	}

}
