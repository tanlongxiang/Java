import java.util.Scanner;
public class Text {
	public static void main(String[] args) {
		System.out.println("����x��ֵ��");
		Scanner num=new Scanner(System.in);//�Ӽ�������
         int x=num.nextInt();//	�Ӽ������������ֵ
         int y;
         if(x<1) {
        	y=x;
        	System.out.println("���y��ֵ��"+"\n"+y);
         }
         else if((1<=x)&&(x<10)) {//�߼���
        	y =2*x-1;
        	System.out.println("���y��ֵ��"+"\n"+y);
         }
         else {
            y=3*x-1;
            System.out.println("���y��ֵ��"+"\n"+y);
         num.close();
         }
         }
	}

