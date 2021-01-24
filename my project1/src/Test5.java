
public class Test5 {
	public static void main(String[] args) {
		double sum=0;int num=1,a=1;//声明变量赋予初始值
		for(int i=0;i<20;i++) {//for循环
			sum=sum+1.0/num;//前二十项累计叠加
			a=a+1;
		     num=num*a;			//分母累乘叠加
		   }
System.out.println("1+1/2!+1/3!+1/4!+.....的前20项和:"+"\n"+sum);
	}

}
