class Cirlce{
	double radius;               //声明变量
 double	findArea(double radius){ //实例方法 
	return 3.14*radius*radius;   //计算面积并且返回值
}
}
 class PassObject {            
	
public void printAreas(Cirlce c,int time) {    //实例方法 调用Cirlce方法
	System.out.println("半径：  面积：");
	for(int i=1;i<=time;i++) {            //设置for循环并且将for循环中的i作为半径值	
  System.out.println(i+"      "+c.findArea(i));//调用findArea方法将i带入
	}	
}
}
public  class ShuChu{         
	 public static void main(String[] args) {
	 	Cirlce c=new Cirlce();               //创建对象属于CIrcle类，创建对象属于PassObject类
	 	PassObject b=new PassObject();
	 	b.printAreas(c,5);       //调用printArea方法进行赋值输出
	 }

	 }