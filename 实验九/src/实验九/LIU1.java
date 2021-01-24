package 实验九;
import java.io.*;
public class LIU1 {
	public static void main(String[] args) {
		      byte []a ="Happy New Year".getBytes();
		      byte []b="新年快乐".getBytes();
          File flie=new File ("a.txt");
         try {
			OutputStream out =  new FileOutputStream(flie);
			System.out.println(flie.getName()+"文档在创建之后未输入的大小："+flie.length()+"字节");
            out.write(a);
			System.out.println(flie.getName()+"文档在创建之后有输入的大小："+flie.length()+"字节");
			out.close();
			out=new FileOutputStream(flie,true);
			System.out.println(flie.getName()+"文档未刷新的大小："+flie.length()+"字节");
		    out.write(b);
		    System.out.println(flie.getName()+"文档加入新的字节的大小："+flie.length()+"字节");
            out.close();
         } 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
