package ��;
import java.util.Scanner;

/**����һ��������Pet����װ����name��sex������һ���������������Ĺ��캯�����������󷽷�void talk()��void eat()��

����һ��Dog��̳���Pet����װ����color�������������������Ĺ��캯������дtalk()��eat()������

����һ��Cat��̳���Pet����װ����weight�������������������Ĺ��캯������дtalk()��eat()������

��д�����࣬ͨ���вι��캯��ʵ����Dog����󣬵���talk()������eat()������ͨ���вι��캯��ʵ����Cat�����
������talk()������eat()������ */
abstract class Pet
{
	private String name ;
	private String sex;
	String  get() {
		return "���ƣ�"+name+" �Ա�"+sex;
	}
	Pet(String name ,String sex)
	{
		this.name=name;
		this.sex=sex;
	}
	abstract void talk();
	abstract void eat();
} 
/**����˵�� �������룺

̩��

male

brown

��˹è

male

2.5


Ԥ�������

���ƣ�̩�ϣ��Ա�male����ɫ��brown��������

̩�ϳԹ�ͷ��

���ƣ���˹è���Ա�male�����أ�2.5kg��������

��˹è���㣡*/
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
		System.out.println(get()+"��ɫ��"+color+"��������");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("̩�ϳԹ�ͷ��");
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
		System.out.println("get()+���أ�"+weight+"��������");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("��˹è����!");
	}
}
public class shangzhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String dogname="̩��";//sc.nextLine();
		String dogmale="male";//sc.nextLine();
        String color ="brown";//sc.nextLine();
        String catname="��˹è";//sc.nextLine();
        String catmale="male";//sc.nextLine();
        double weight=2.5;//sc.nextDouble();
        Pet dog=new Dog(dogname,dogmale,color);
        Pet cat=new Cat(catname,catmale,weight);
        dog.talk();dog.eat();
        cat.talk();cat.eat();
        sc.close();
	}

}
