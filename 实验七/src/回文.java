import java.util.Scanner;
public class 回文 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;                  //声明一个boolean类型变量作为一个标志位
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入字符：");
     String str=sc.nextLine();         //string型数据的输入放方法             
     int len=str.length();              //得到输入字符的长度
     System.out.println("字符长度为："+len);
    for(int i=0;i<(len/2);i++) {             //设置一个for循环长度设置循环次数设置字符长度减一就可以，因为这是判断字符是否是回文   
    	if(str.charAt(i)!=str.charAt(len-1-i)) {//每次循环与他对应的字符对比就可以
    		flag=false;           //标志位用于做判断如果不是回文就会置flag为false
    		break;                //结束for循环
    	}
    }
    //System.out.println(flag?str+"是回文":str+"不是回文");//使用三目运算输出
    if(flag==false) {      //标志位判断通过标志位判断是否是回文
    	System.out.println("不是回文");
    	}
    else System.out.println("是回文");
    sc.close();
}
}
