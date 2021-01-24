package 实验九;
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
		//声明变量
         String str1;
         String str2;
         String pan=null;
         //将数据从键盘输入
         Scanner sc=new Scanner(System.in);
         System.out.println("输入第一行：");
         str1=sc.next();
         System.out.println("输入第二行：");
         str2=sc.next();
         //创建两个文件
         File file1=new File("第一个.txt");
         File file2=new File("第二个.txt");
         try {
        	   System.out.println("文件内容：");
        	//将第一个文件放入输出流输入流
			FileWriter out1=new FileWriter(file1);
			FileReader in1=new FileReader(file1);
			//再将这两个流的对象放入缓冲流
			BufferedWriter bu1=new BufferedWriter(out1);
			BufferedReader bu2=new BufferedReader(in1);
			//用缓冲流对象写数据
			bu1.write(str1);
			bu1.newLine();
			bu1.write(str2);
			bu1.newLine();
			//关闭流
			bu1.close();
			out1.close();
			//将第二个文件放入输出流
			FileWriter out2=new FileWriter(file2);
			bu1=new BufferedWriter(out2);
			int i=1;
			//用缓冲流读取第一个文件的内容放入pan变量中
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
