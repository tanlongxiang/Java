class Box{
   int length,width,height;                            //��������
   void setInfo(int length,int width,int height) {     //��ʼ������ ʵ������
	   this.length=length;                             //��this��ֵ����Ա����
	   this.width=width;
	   this.height=height;
   }
   public int voulumn() {                       //ʵ������
	   return length*width*height;                   //����㷨
   }
   public int area() {                                       
	   return 2*(length*width+length*height+width*height);  //������㷨
   }
      public String toString() {                                        //��String����ʹ��ֵ����Ϊ�ַ���
    	  return "�����壺��="+length+"����="+width+"����="+height+"��"
    	  		+ "���="+length*width*height+"��"
    	  		+ "�����="+2*(length*width+length*height+width*height)+"��";
   }
}
public class BoxTest {
	public static void main(String[] args) {
		Box box1=new Box();                                        //��������
         box1.setInfo(2,3,4);                                     //Ϊ����ֵ �������淽��
         System.out.println("box1�����Ϊ��"+box1.voulumn());      //���÷������
         System.out.println("box1�ı������"+box1.area());
         System.out.println(box1.toString());                 //����String����          
	}

}
