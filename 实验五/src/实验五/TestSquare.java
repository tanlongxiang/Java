package 实验五;
interface IShape{         //接口的声明
	public double area();   //创建抽象方法
}
class square implements IShape{   //创建类声明自己实现接口
	double bian;         
	square(double a){           // 构造方法初始化边长
		bian=a;
	}
	public double area() {   //重写接口中的抽象方法
		return bian*bian;    //返回面积  
	}
}
public class TestSquare {

	public static void main(String[] args) {
		square sq=new square(12.5);          //创建square类的调用构造方法
		System.out.println("正方形面积："+sq.area());
	}

}
