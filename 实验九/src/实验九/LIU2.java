package 实验九;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class LIU2 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//写原文
		char mi[]="I wish you all happy without hypocrisy\r\nMay you enjoy this kind of sincere\r\n愿你所有快乐无需装假\r\n愿你此生尽兴赤诚善良\r\n".toCharArray();
		//为密文创建数组长度为原文数组长度
		char jie[]=new char[mi.length];
		int n=0;
		//创建文件
       File file=new File("serect.txt");
       try {
    	//输出流
	    FileWriter out1=new FileWriter(file);
	    //输入流
		FileReader in=new FileReader(file);
		//对原文加密
		for(int i=0;i<mi.length;i++) {
			mi[i]=(char) (mi[i]^'T');
		}
		//输出流将原文输出到文件里面
		out1.write(mi,0,mi.length);
		//关闭流
		out1.close();
		System.out.println("密文：");
		//输入流读取文件中的字节
		while((n=in.read(jie, 0,jie.length))!=-1) {
			//将文件中的字节转换为字符
			String s=new String(jie,0,n);
			//打印在屏幕上
			System.out.print(s);
		}
		in.close();
		//解密文件
		for(int i=0;i<jie.length;i++) {
			 jie[i]=(char) (jie[i]^'T');
		}
		in=new FileReader(file);
		System.out.println();
		System.out.println("原文：");
		//将原文转换为字符串
		String c=new String(jie,0,jie.length);
		System.out.println(c);
		//用输出流将原文输入到文件当中 采用不刷新的方式
		out1=new FileWriter(file,true);	
		out1.write(jie);
		//关闭流
		out1.close();
		in.close();
       }
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
		
	}


