package 考试;
import java.util.Scanner;
class Circle{
private double radius;
    Circle(double radius){
    this.radius=radius;
    }
    Circle(){}
    void setRadius(double r){
    radius=r;
    }
   double getRadius(){
return radius;
}
 double getArea(){
  return radius*radius*Math.PI;
}
 double getPerimeter(){
 return 2*Math.PI*radius;
}
  public String toString( ){
  return "Circle(r:"+getRadius()+")";
  }
}
class Cylinder{
    private double height;
private Circle circle;
    Cylinder(double height,Circle circle){
        this.height=height;
        this.circle=circle;
    }
     Cylinder(){}
       void setHeight(double height){
             this.height=height;
       }
       double getHeight(){
              return height;
       }
     void setCircle(Circle circle){
         this.circle=circle;
     }
    Circle getCircle(){
        return circle;
    }
    double getArea(){
        return 2*circle.getArea()+height*circle.getPerimeter();
    }
     double getVolume(){
         return circle.getArea()*height;
     }
    public String toString( ){
        return "Cylinder(h:"+getHeight()+",Circle(r:"+circle.getRadius()+"))";
    }
    }  
public class 最后一题{
    public static void main(String args[]) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            String str = input.next();
            if(str.equals("Circle")) {
                Circle c = new Circle(input.nextDouble());
                System.out.println("The area of " + c.toString() + " is " + String.format("%.2f",c.getArea()));
                System.out.println("The perimeterof " + c.toString() + " is "+ String.format("%.2f",c.getPerimeter()));
            } else if(str.equals("Cylinder")) {
                Cylinder r = new Cylinder(input.nextDouble(), new Circle(input.nextDouble()));
                System.out.println("The area of " + r.toString() + " is " + String.format("%.2f",r.getArea()));
                System.out.println("The volume of " + r.toString() + " is " + String.format("%.2f",r.getVolume()));
            }
        }
    }
}