package ����;

class B{
    int x=100,y=200;
    public void setX(int x){ this.x=x; }
    public void setY(int y){ this.y=y; } 
    public int getXYSum(){ return x+y; } 
 } 
 public class A { 
    public static void main(String args[]){
       int 	c=1,i=2;
        B b=new B(); 
        b.setX(-100); 
        b.setY(-200); 
        System.out.println("sum="+b.getXYSum()); 
        System.out.println("h"+1+"cnm"+2); 
        System.out.println(c+i);
    } 
 } 