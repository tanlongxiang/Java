import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
	System.out.println("���뻪���¶ȣ�") ;        
	 Scanner temp =new Scanner(System.in);    //����Ӽ�������
	   Float f = temp.nextFloat();            //������ĸ���һ������
	   Float c= 5*(f-32)/9.0f;                  //��ʽ
	   System.out.println("��������¶ȣ�"+c) ;
     temp.close();
	}

}
