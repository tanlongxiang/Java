package ʵ��ʮ;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpeakHello speakHello=new SpeakHello();
        SpeakNihao speakNihao=new SpeakNihao();
        //ֱ�ӵ���run����û��ʵ�ֶ��߳�
        speakHello.run();
        //������start���������˷�֧ջ�ռ���ж��߳�
        speakNihao.start();
        for (int i = 1; i < 15; i++) {
			System.out.println("��Һ�"+i+" ");
		}
	}
}
//ֱ�Ӽ̳�Thread������дrun����
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
			System.out.println("����"+i+" ");
		}
	}
}