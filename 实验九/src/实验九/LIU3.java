package ʵ���;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class LIU3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
         String str1;
         String str2;
         String pan=null;
         //�����ݴӼ�������
         Scanner sc=new Scanner(System.in);
         System.out.println("�����һ�У�");
         str1=sc.next();
         System.out.println("����ڶ��У�");
         str2=sc.next();
         //���������ļ�
         File file1=new File("��һ��.txt");
         File file2=new File("�ڶ���.txt");
         try {
        	   System.out.println("�ļ����ݣ�");
        	//����һ���ļ����������������
			FileWriter out1=new FileWriter(file1);
			FileReader in1=new FileReader(file1);
			//�ٽ����������Ķ�����뻺����
			BufferedWriter bu1=new BufferedWriter(out1);
			BufferedReader bu2=new BufferedReader(in1);
			//�û���������д����
			bu1.write(str1);
			bu1.newLine();
			bu1.write(str2);
			bu1.newLine();
			//�ر���
			bu1.close();
			out1.close();
			//���ڶ����ļ����������
			FileWriter out2=new FileWriter(file2);
			bu1=new BufferedWriter(out2);
			int i=1;
			//�û�������ȡ��һ���ļ������ݷ���pan������
			while((pan=bu2.readLine())!=null) {
				System.out.println(pan+i);
				i++;
				bu1.write(pan);
				bu1.newLine();
			}
			bu1.close();
			bu2.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         sc.close();
	}

}
