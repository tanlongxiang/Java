package 杂;

import java.util.Scanner;

public class TestToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String i=sc.next();
      char  j=sc.next().charAt(0);
       if(i=="%") {
    	   System.out.println("正确");
       }
       else System.out.println("错误");
       if(j=='%') {
    	   System.out.println("正确");
       }
       else System.out.println("错误");
      	
	sc.close();
	}
	

}
 //char []r=i.toCharArray();