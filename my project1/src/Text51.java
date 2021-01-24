
public class Text51 {

	public static void main(String[] args) {
		double sum=0;    //声明变量赋初始值
		int i=1,num=1;
        while(i<=20) {   //do while循环
        sum=sum+1.0/num	;//前二十项和累加
        i=i+1;           //这两句表示分母累乘
        num=num*i;       
        
        }
        System.out.println("1+1/2!+1/3!+1/4!+.....的前二十项和："+"\n"+sum);
	}

}
