package ¿¼ÊÔ;

class Studen
{ 
    private String name; 
    private int  grade;
    public void setName(String name)
        { 
    	this.name=name;
        } 
    public String getName(){ 
          return name;
} 
    public void setGrade(int grade) {
        this.grade=grade; 
    } 
    public int getGrade()
{
        return grade; 
    } 
    public Studen(){  } 
    public Studen(String n,int g){
          name = n;
        grade = g;
     } 
    public String message(){ 
        return name+"\n"+grade;

    } 
} 
public class Main_1 { 
    public static void main(
String[] args
){ 
        Studen stu1=new Studen(); 
        stu1.setName("LiHong");
        stu1.setGrade(
90
);
        System.out.println(stu1.getName()+"\n"+stu1.getGrade()); 
        Studen stu2=new Studen("HeMin",70);
        System.out.println(stu2.message()); 
    } 
}
