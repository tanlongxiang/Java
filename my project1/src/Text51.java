
public class Text51 {

	public static void main(String[] args) {
		double sum=0;    //������������ʼֵ
		int i=1,num=1;
        while(i<=20) {   //do whileѭ��
        sum=sum+1.0/num	;//ǰ��ʮ����ۼ�
        i=i+1;           //�������ʾ��ĸ�۳�
        num=num*i;       
        
        }
        System.out.println("1+1/2!+1/3!+1/4!+.....��ǰ��ʮ��ͣ�"+"\n"+sum);
	}

}
