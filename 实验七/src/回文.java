import java.util.Scanner;
public class ���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;                  //����һ��boolean���ͱ�����Ϊһ����־λ
    Scanner sc=new Scanner(System.in);
    System.out.println("�������ַ���");
     String str=sc.nextLine();         //string�����ݵ�����ŷ���             
     int len=str.length();              //�õ������ַ��ĳ���
     System.out.println("�ַ�����Ϊ��"+len);
    for(int i=0;i<(len/2);i++) {             //����һ��forѭ����������ѭ�����������ַ����ȼ�һ�Ϳ��ԣ���Ϊ�����ж��ַ��Ƿ��ǻ���   
    	if(str.charAt(i)!=str.charAt(len-1-i)) {//ÿ��ѭ��������Ӧ���ַ��ԱȾͿ���
    		flag=false;           //��־λ�������ж�������ǻ��ľͻ���flagΪfalse
    		break;                //����forѭ��
    	}
    }
    //System.out.println(flag?str+"�ǻ���":str+"���ǻ���");//ʹ����Ŀ�������
    if(flag==false) {      //��־λ�ж�ͨ����־λ�ж��Ƿ��ǻ���
    	System.out.println("���ǻ���");
    	}
    else System.out.println("�ǻ���");
    sc.close();
}
}
