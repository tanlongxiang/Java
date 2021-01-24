package 杂;
import java.util.Scanner;

/**声明一个抽象类Pet，封装属性name和sex，声明一个带有两个参数的构造函数，声明抽象方法void talk()和void eat()；

声明一个Dog类继承自Pet，封装属性color，声明带有三个参数的构造函数，复写talk()和eat()方法；

声明一个Cat类继承自Pet，封装属性weight，声明带有三个参数的构造函数，复写talk()和eat()方法；

编写测试类，通过有参构造函数实例化Dog类对象，调用talk()方法和eat()方法；通过有参构造函数实例化Cat类对象
，调用talk()方法和eat()方法； */
abstract class Pet
{
	private String name ;
	private String sex;
	String  get() {
		return "名称："+name+" 性别："+sex;
	}
	Pet(String name ,String sex)
	{
		this.name=name;
		this.sex=sex;
	}
	abstract void talk();
	abstract void eat();
} 
/**测试说明 测试输入：

泰迪

male

brown

波斯猫

male

2.5


预期输出：

名称：泰迪，性别：male，颜色：brown，汪汪叫

泰迪吃骨头！

名称：波斯猫，性别：male，体重：2.5kg，喵喵叫

波斯猫吃鱼！*/
class Dog extends Pet
{
   private  String color;
	Dog(String name, String sex,String color)
	{
		super(name, sex);
		this.color=color;
	}
	@Override
	void talk() {
		// TODO Auto-generated method stub
		System.out.println(get()+"颜色："+color+"，汪汪叫");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("泰迪吃骨头！");
	}
	
}
class Cat extends Pet
{
   private double weight;
	Cat(String name, String sex,double weight)
	{
		super(name, sex);
		this.weight=weight;
	}
	@Override
	void talk() {
		// TODO Auto-generated method stub
		System.out.println("get()+体重："+weight+"，喵喵叫");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("波斯猫吃鱼!");
	}
}
public class shangzhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String dogname="泰迪";//sc.nextLine();
		String dogmale="male";//sc.nextLine();
        String color ="brown";//sc.nextLine();
        String catname="波斯猫";//sc.nextLine();
        String catmale="male";//sc.nextLine();
        double weight=2.5;//sc.nextDouble();
        Pet dog=new Dog(dogname,dogmale,color);
        Pet cat=new Cat(catname,catmale,weight);
        dog.talk();dog.eat();
        cat.talk();cat.eat();
        sc.close();
	}

}
