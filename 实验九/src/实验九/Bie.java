package ʵ���;
import java.io.*;
public class Bie {
public static void main(String args[]){
	char a []="����ʮ����10�㷢���ܹ�".toCharArray();
	int n=0;
	try{ File f=new File("secret.txt");
	for(int i=0;i<a.length;i++) {
		a[i]=(char)(a[i]^'R');
	}
	FileWriter out = new FileWriter(f);
	out.write(a,0,a.length);
	out.close();
	FileReader in = new FileReader(f);
	char tom[]= new char[a.length];
	System.out.println("���ģ�");
	while((n=in.read(tom,0,tom.length))!=-1) {
		String s = new String (tom,0,n);
		System.out.println(s);
	}
	in.close();
	System.out.println("����:");
	in = new FileReader(f);
	while((n=in.read(tom,0,tom.length))!=-1) {
		for (int i=0;i<n;i++) {
			tom[i]=(char)(tom[i]^'R');
		}
		String s = new String(tom,0,n);
		System.out.println(s);
		
	}
	in.close();
	FileWriter cwq = new FileWriter(f,true);
	cwq.write(tom,0,tom.length);
	cwq.close();
	}
	catch(IOException e) {
		System.out.println(e.toString());
	}
}
}
