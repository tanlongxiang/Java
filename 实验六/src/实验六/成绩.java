package ʵ����;
import java.util.Scanner;
public class �ɼ� {
	public static void main(String[] args) {
		System.out.println("����ٷ��Ƴɼ���");
		Scanner num=new Scanner(System.in);//�Ӽ�������
		int socre=num.nextInt();//��ֵ����
	    chengji a=new chengji();//����������ù��췽��
		try {                   //try��䲶׽�쳣
			a.show(socre);
		} 
		catch (NumbeRangeException e) {
			System.out.println(e.message);//��ӡ�쳣��Ϣ
		}
		num.close();
	}
}

class chengji {
	void show(int socre) throws NumbeRangeException{
		if(socre<0||socre>100)//�����ж��Ƿ��׳��쳣
		throw new NumbeRangeException();   //�׳��쳣
		switch(socre/10) {
		case 10:
			System.out.println("�ɼ��ȼ�Ϊ��"+"\n"+"A");
			break;
		case 9:
			System.out.println("�ɼ��ȼ�Ϊ��"+"\n"+"A");
			break;
		case 8:
			System.out.println("�ɼ��ȼ�Ϊ��"+"\n"+"B");
			break;
		case 7:
			System.out.println("�ɼ��ȼ�Ϊ��"+"\n"+"C");
			break;
		case 6:
			System.out.println("�ɼ��ȼ�Ϊ��"+"\n"+"D");
			break;
		default:
			System.out.println("�ɼ��ȼ�Ϊ��"+"\n"+"E");
			
		}
		
	}
		}
class NumbeRangeException extends Exception{//�Զ����쳣
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message="�ɼ��쳣����������ȷ�ĳɼ�";
	String warnMess() {
		return message;
	}
    
	}
