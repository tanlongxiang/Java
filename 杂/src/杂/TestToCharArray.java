package ��;

import java.util.Scanner;

public class TestToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String i=sc.next();
      char  j=sc.next().charAt(0);
       if(i=="%") {
    	   System.out.println("��ȷ");
       }
       else System.out.println("����");
       if(j=='%') {
    	   System.out.println("��ȷ");
       }
       else System.out.println("����");
      	
	sc.close();
	}
	

}
 //char []r=i.toCharArray();