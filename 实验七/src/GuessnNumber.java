import java.util.Scanner;
import java.util.Random;    //�����������
public class GuessnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("resource")
	Scanner reader =new Scanner(System.in);
     Random random=new Random();
     System.out.println("����һ��1��100֮�����������²������");
     int yourGuess=0;
     System.out.println("��������Ĳ²⣺");
     while(1>0){                            //��һѭ���ó�����Խ��ж�β²�
    int realNumber=random.nextInt(100)+1;    //random.nextInt(100)��ʾ�������һ����0~99������Ϊ��Ŀ��Ҫ��1~100���Ը����ɵĽ����һ
     yourGuess=reader.nextInt();
     if(yourGuess>realNumber) {    //�����жϴ�С
    	 System.out.println("�´��ˣ�"+"\n"+"��ȷ����ֵ�ǣ�"+realNumber);
     }
     else if(yourGuess<realNumber) {
    	 System.out.println("��С�ˣ�"+"\n"+"��ȷ����ֵ�ǣ�"+realNumber);
     }
     else  System.out.println("�¶��ˣ�"+"\n"+"��ȷ����ֵ�ǣ�"+realNumber);
	}
	}
}
