package ʵ���;
import java.io.*;
public class LIU1 {
	public static void main(String[] args) {
		      byte []a ="Happy New Year".getBytes();
		      byte []b="�������".getBytes();
          File flie=new File ("a.txt");
         try {
			OutputStream out =  new FileOutputStream(flie);
			System.out.println(flie.getName()+"�ĵ��ڴ���֮��δ����Ĵ�С��"+flie.length()+"�ֽ�");
            out.write(a);
			System.out.println(flie.getName()+"�ĵ��ڴ���֮��������Ĵ�С��"+flie.length()+"�ֽ�");
			out.close();
			out=new FileOutputStream(flie,true);
			System.out.println(flie.getName()+"�ĵ�δˢ�µĴ�С��"+flie.length()+"�ֽ�");
		    out.write(b);
		    System.out.println(flie.getName()+"�ĵ������µ��ֽڵĴ�С��"+flie.length()+"�ֽ�");
            out.close();
         } 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
