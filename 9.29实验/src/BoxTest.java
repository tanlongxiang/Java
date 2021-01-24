class Box{
   int length,width,height;                            //声明变量
   void setInfo(int length,int width,int height) {     //初始化变量 实例方法
	   this.length=length;                             //用this赋值给成员变量
	   this.width=width;
	   this.height=height;
   }
   public int voulumn() {                       //实例方法
	   return length*width*height;                   //体积算法
   }
   public int area() {                                       
	   return 2*(length*width+length*height+width*height);  //表面积算法
   }
      public String toString() {                                        //用String方法使数值返回为字符串
    	  return "长方体：长="+length+"，宽="+width+"，高="+height+"；"
    	  		+ "体积="+length*width*height+"；"
    	  		+ "表面积="+2*(length*width+length*height+width*height)+"；";
   }
}
public class BoxTest {
	public static void main(String[] args) {
		Box box1=new Box();                                        //声明对象
         box1.setInfo(2,3,4);                                     //为对象赋值 调用上面方法
         System.out.println("box1的体积为："+box1.voulumn());      //调用方法输出
         System.out.println("box1的表面积："+box1.area());
         System.out.println(box1.toString());                 //调用String方法          
	}

}
