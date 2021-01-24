package 实验十;

import java.util.Random;
//创建两个线程
class XianCheng_1 implements Runnable{
//调用随机数函数
	Random random=new Random();
	//重写run方法
public void run() {
		for(int i=0;i<10;i++) {
	      System.out.println("开始执行第a个线程："+i);
	      try {
	    	  //休眠不到10ms
			Thread.sleep(random.nextInt(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("a线程结束！");
	}
}
class XianCheng_2 implements Runnable{
	Random random=new Random();
public void run() {
		for(int i=0;i<10;i++) {
	      System.out.println("开始执行第b个线程："+i);
	      try {
			Thread.sleep(random.nextInt(10));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		System.out.println("b线程结束！");
	}
}
public class TestThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("main方法的的线程开始");
           //声明实现接口类的对象
           XianCheng_1 xian1=new XianCheng_1();
           XianCheng_2 xian2=new XianCheng_2();
           // 多态  将这些对象放入Thread类用来调用start方法
           Thread a=new Thread(xian1);
           Thread b=new Thread(xian2);
           //启动线程 启动线程会自动调用run方法
           a.start();
           b.start();
           //做一个延时观察下现象
           for(int i=10000;i>0;i--) 
        	   for(int j=10000;j>0;j--);
           System.out.println("main方法线程结束！");
	}

}
