import java.util.Scanner;
public class 年月日 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.print("请输入年月日：");
	int year=sc.nextInt();
	int month=sc.nextInt();
	int day=sc.nextInt();
      System.out.println(year+"年"+month+"月"+day+"日");
      int sumday=0;
      switch (month) {
      case 12:
    	  sumday=sumday+30;
      case 11:
    	  sumday=sumday+31;
      case 10:
    	  sumday=sumday+30;
      case 9:
    	  sumday=sumday+31;
      case 8:
    	  sumday=sumday+31;
      case 7:
    	  sumday=sumday+30;
      case 6:
    	  sumday=sumday+31;
      case 5:
    	  sumday=sumday+31;         
         
      case 4:
    	  sumday=30+sumday;
	  case 3:
	  if(year%40==0||year%400==0) {
	  sumday=29+sumday;
       }
	  else 
	  sumday=28+sumday;  
      case 2:
    	  sumday=sumday+31;
      case 1:
    	  sumday=sumday+day;
    	 break;
      }
      System.out.println("这是一年中的第"+sumday+"天。");
      sc.close();
	}

}
