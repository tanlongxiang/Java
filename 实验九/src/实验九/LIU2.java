package ʵ���;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class LIU2 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//дԭ��
		char mi[]="I wish you all happy without hypocrisy\r\nMay you enjoy this kind of sincere\r\nԸ�����п�������װ��\r\nԸ��������˳������\r\n".toCharArray();
		//Ϊ���Ĵ������鳤��Ϊԭ�����鳤��
		char jie[]=new char[mi.length];
		int n=0;
		//�����ļ�
       File file=new File("serect.txt");
       try {
    	//�����
	    FileWriter out1=new FileWriter(file);
	    //������
		FileReader in=new FileReader(file);
		//��ԭ�ļ���
		for(int i=0;i<mi.length;i++) {
			mi[i]=(char) (mi[i]^'T');
		}
		//�������ԭ��������ļ�����
		out1.write(mi,0,mi.length);
		//�ر���
		out1.close();
		System.out.println("���ģ�");
		//��������ȡ�ļ��е��ֽ�
		while((n=in.read(jie, 0,jie.length))!=-1) {
			//���ļ��е��ֽ�ת��Ϊ�ַ�
			String s=new String(jie,0,n);
			//��ӡ����Ļ��
			System.out.print(s);
		}
		in.close();
		//�����ļ�
		for(int i=0;i<jie.length;i++) {
			 jie[i]=(char) (jie[i]^'T');
		}
		in=new FileReader(file);
		System.out.println();
		System.out.println("ԭ�ģ�");
		//��ԭ��ת��Ϊ�ַ���
		String c=new String(jie,0,jie.length);
		System.out.println(c);
		//���������ԭ�����뵽�ļ����� ���ò�ˢ�µķ�ʽ
		out1=new FileWriter(file,true);	
		out1.write(jie);
		//�ر���
		out1.close();
		in.close();
       }
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
		
	}


