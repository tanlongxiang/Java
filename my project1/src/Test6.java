
public class Test6 {

	public static void main(String[] args) {
		System.out.println("1000以内所有的完数：");
	   	int i=0,sum=0,j=0;      //声明变量
		for(i=1;i<=1000;i++) {  //for循环1000以内所有的数
			for(j=1;j<i;j++) {  //开始循环比完数小的每一个数
			{
				if(i%j!=0) 		//用循环出来边比完数小的数来用百分号除以自生观察是否能够除尽
				continue;       //contine语句
				              }
			    sum=sum+j;      //能除尽的数被循环出来进行累加 
			}
				if(sum==i)      //判断它除出来的数相加是否等于自生
				System.out.print(i+" ");	
			
				sum=0;          //循环除一个完数要对他们因子的累加和清零，这样才能不影响下一次循环
		}
	
	}
}
