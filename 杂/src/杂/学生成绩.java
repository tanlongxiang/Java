package 杂;
import java.util.*;
//实现学生成绩管理系统：要求输入5个学生的学号，姓名和语文，数学，英语，历史，化学五门课程的成绩



public class 学生成绩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num;double yu,hua,shu,yin,li;
      String name;int xuehao[]=new int[5];
      double secore1[]=new double [5],secore2[]=new double [5],secore3[]=new double [5],secore4[]=new double [5],secore5[]=new double [5];
      String name1[]=new String[5];
      for(int i=0;i<5;i++) {
      System.out.print("请输入名字：");
      name=sc.next();
      System.out.print("请输入学号：");
      num=sc.nextInt();
      System.out.print("语文：");
      yu=sc.nextDouble();
      System.out.print("数学：");
      shu=sc.nextDouble();
      System.out.print("英语：");
      yin=sc.nextDouble();
      System.out.print("历史：");
      li=sc.nextDouble();
      System.out.print("化学：");
      hua=sc.nextDouble();
      if(i==0) {secore1[i]=yu;secore2[i]=shu;secore3[i]=yin;secore4[i]=li;secore5[i]=hua;name1[i]=name;xuehao[i]=num;}
      else if(i==1) {secore1[i]=yu;secore2[i]=shu;secore3[i]=yin;secore4[i]=li;secore5[i]=hua;name1[i]=name;xuehao[i]=num;}
      else if(i==2) {secore1[i]=yu;secore2[i]=shu;secore3[i]=yin;secore4[i]=li;secore5[i]=hua;name1[i]=name;xuehao[i]=num;}
      else if(i==3) {secore1[i]=yu;secore2[i]=shu;secore3[i]=yin;secore4[i]=li;secore5[i]=hua;name1[i]=name;xuehao[i]=num;}
      else if(i==4) {secore1[i]=yu;secore2[i]=shu;secore3[i]=yin;secore4[i]=li;secore5[i]=hua;name1[i]=name;xuehao[i]=num;}
      else  {secore1[i]=yu;secore2[i]=shu;secore3[i]=yin;secore4[i]=li;secore5[i]=hua;xuehao[i]=num;}
      }//输出每个学生的总成绩和平均成绩，统计并输出各科成绩的最高分，最低分以及各科成绩平均分。
      System.out.println();
      System.out.println("学号  姓名  总成绩  平均分");
      double sum1=secore1[0]+secore2[0]+secore3[0]+secore4[0]+secore5[0];
      double avg1=sum1/5;
      System.out.println(xuehao[0]+"  "+name1[0]+"   "+sum1+"  "+avg1);
      double sum2=secore1[1]+secore2[1]+secore3[1]+secore4[1]+secore5[1];
      double avg2=sum2/5;
      System.out.println(xuehao[1]+"  "+name1[1]+"   "+sum2+"  "+avg2);
      double sum3=secore1[2]+secore2[2]+secore3[2]+secore4[2]+secore5[2];
      double avg3=sum3/5;
      System.out.println(xuehao[2]+"  "+name1[2]+"   "+sum3+"  "+avg3);
      double sum4=secore1[3]+secore2[3]+secore3[3]+secore4[3]+secore5[3];
      double avg4=sum4/5;
      System.out.println(xuehao[3]+"  "+name1[3]+"   "+sum4+"  "+avg4);
      double sum5=secore1[4]+secore2[4]+secore3[4]+secore4[4]+secore5[4];
      double avg5=sum5/5;
      System.out.println(xuehao[4]+"  "+name1[4]+"   "+sum5+"  "+avg5);
      System.out.println();
      System.out.println("科目   最低分  最高分   平均分");
     for(int i=0;i<4;i++) {
    	 for(int j=i+1;j<5;j++) {
    		 if(secore1[i]>secore1[j]) {
    			 double k=0;
    			 k= secore1[i];
    			 secore1[i]=secore1[j];
    			 secore1[j]=k;
    		 }
    		 }
    	 }
     double sumY=0;
    	for (int i=0;i<5;i++) {
    		sumY=sumY+secore1[i];
    	}
    	  System.out.println("语文： "+secore1[0]+"    "+secore1[4]+"     "+sumY/5);
    	  for(int i=0;i<4;i++) {
    	    	 for(int j=i+1;j<5;j++) {
    	    		 if(secore2[i]>secore2[j]) {
    	    			 double k=0;
    	    			 k= secore2[i];
    	    			 secore2[i]=secore2[j];
    	    			 secore2[j]=k;
    	    		 }
    	    		 }
    	    	 }
    	     double sumS=0;
    	    	for (int i=0;i<5;i++) {
    	    		sumS=sumS+secore2[i];
    	    	}
    	    	  System.out.println("数学： "+secore2[0]+"    "+secore2[4]+"     "+sumS/5);
    	    	  for(int i=0;i<4;i++) {
    	    	    	 for(int j=i+1;j<5;j++) {
    	    	    		 if(secore3[i]>secore3[j]) {
    	    	    			 double k=0;
    	    	    			 k= secore3[i];
    	    	    			 secore3[i]=secore3[j];
    	    	    			 secore3[j]=k;
    	    	    		 }
    	    	    		 }
    	    	    	 }
    	    	     double sumYU=0;
    	    	    	for (int i=0;i<5;i++) {
    	    	    		sumYU=sumYU+secore3[i];
    	    	    	}
    	    	    	  System.out.println("英语： "+secore3[0]+"    "+secore3[4]+"     "+sumYU/5); 
    	    	    	  for(int i=0;i<4;i++) {
    	    	    	    	 for(int j=i+1;j<5;j++) {
    	    	    	    		 if(secore4[i]>secore4[j]) {
    	    	    	    			 double k=0;
    	    	    	    			 k= secore4[i];
    	    	    	    			 secore4[i]=secore4[j];
    	    	    	    			 secore4[j]=k;
    	    	    	    		 }
    	    	    	    		 }
    	    	    	    	 }
    	    	    	     double sumL=0;
    	    	    	    	for (int i=0;i<5;i++) {
    	    	    	    		sumL=sumL+secore4[i];
    	    	    	    	}
    	  System.out.println("历史： "+secore4[0]+"    "+secore4[4]+"     "+sumL/5);
    	  for(int i=0;i<4;i++) {
    	    	 for(int j=i+1;j<5;j++) {
    	    		 if(secore5[i]>secore5[j]) {
    	    			 double k=0;
    	    			 k= secore5[i];
    	    			 secore5[i]=secore5[j];
    	    			 secore5[j]=k;
    	    		 }
    	    		 }
    	    	 }
    	   	    double sumH=0;
  	      	  	for (int i=0;i<5;i++) {
    	    		sumH=sumH+secore5[i];
    	     	   	}
    	     System.out.println("化学： "+secore5[0]+"    "+secore5[4]+"     "+sumL/5);
    	     sc.close();
	}
}
