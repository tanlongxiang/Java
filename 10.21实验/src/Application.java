class Animal{
	private String name;//声明私有变量
	void cry() {        //叫声的输出方法
		System.out.println("叫声：");
	}
	public void setAnimalName(String name) {//设置动物名字的方法
		this.name=name;
	}
	public String getAnimalName(){    //获取动物名字的方法
		return name;
	}
}
class Simulator{               //创造模拟器类
	Animal animal;         //调用Animal类
   public void playSound(Animal animal){//用来转化为上转型对象
		animal.cry();           //调用上转型对象的方法
	}
}
class Dog extends Animal{//子类Dog类继承父类
	public void cry() {  //重写cry方法
		setAnimalName("狗");// 调用父类set方法
		System.out.println(getAnimalName()+"\n"+"狗叫：汪汪汪");
	}
}
class Cat extends Animal{//同上面Dog类
	public void cry() {
		 setAnimalName("猫");
		System.out.println(getAnimalName()+"\n"+"猫叫：喵喵喵");
	}	
}
public class Application {

	public static void main(String[] args) {
		Simulator simulator=new Simulator();//创建对象属于Simulator类调用默认的构造方法
		simulator.playSound(new Dog());     //将new Dog（）赋给 Animal animal animal是Dog的上转型对象
		simulator.playSound(new Cat());
	}

}
