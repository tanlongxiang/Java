class Ball{
    private double r;     //声明私有变量
    public void setR(double x) {  //设置半径方法
    	r=x;
    }
    public double getR() {      //获取半径方法
    	return r;
    }
	
}
class Billiards extends Ball{
	private String color;           
	public void setCol(String col) {//设置颜色方法
		color=col;
	}
	void show() {
		System.out.println("台球颜色："+color+"\n"+"台球半径："+getR());//半径是父类私有变量不能被继承，只能调用继承父类的get的方法
	}
}
public class Test {

	public static void main(String[] args) {
		Billiards bi=new Billiards();//声明一个对象属于子类调用默认构造方法
		bi.setCol("黑色");//调用子类方法
        bi.setR(15);//调用子类继承父类的方法
        bi.show();//调用子类方法进行输出
	}

}
