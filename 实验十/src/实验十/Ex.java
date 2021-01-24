package 实验十;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpeakHello speakHello=new SpeakHello();
        SpeakNihao speakNihao=new SpeakNihao();
        //直接调用run方法没有实现多线程
        speakHello.run();
        //调用了start方法创建了分支栈空间进行多线程
        speakNihao.start();
        for (int i = 1; i < 15; i++) {
			System.out.println("大家好"+i+" ");
		}
	}
}
//直接继承Thread类来重写run方法
class SpeakHello extends Thread{
	public void run() {
		for (int i = 1; i < 15; i++) {
			System.out.println("hello"+i+" ");
		}
	}
}
class SpeakNihao extends Thread{
	public void run() {
		for (int i = 1; i < 20; i++) {
			System.out.println("您好"+i+" ");
		}
	}
}