import java.util.Scanner;
public class Test4 {
	public static void main(String[] args) {
		System.out.println("����ٷ��Ƴɼ���");
		Scanner num=new Scanner(System.in);//�Ӽ�������
		int grade=num.nextInt();//��ֵ����
		if(grade<0||grade>100) {//�жϳɼ��Ƿ���100����
		System.out.println("��������ȷ�ĳɼ�");
		}
		else
		switch(grade/10) {//����10�õ�ʮλ�������֣���ʮλ�������ж�
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
			break;
		}
		num.close();
	}
}
