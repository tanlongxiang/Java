
public class Test5 {
	public static void main(String[] args) {
		double sum=0;int num=1,a=1;//�������������ʼֵ
		for(int i=0;i<20;i++) {//forѭ��
			sum=sum+1.0/num;//ǰ��ʮ���ۼƵ���
			a=a+1;
		     num=num*a;			//��ĸ�۳˵���
		   }
System.out.println("1+1/2!+1/3!+1/4!+.....��ǰ20���:"+"\n"+sum);
	}

}
