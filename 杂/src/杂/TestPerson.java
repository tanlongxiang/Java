package 杂;
class Person{
	String name;
	int age;
	String sex;
	Person(){}
	Person(String name ,int age ,String sex){
		this.name=name ;
		this .age=age;
		this .sex=sex;
	}
	void showlnfo() {
		System.out.println("姓名："+name+"  年龄："+age+" 性别："+sex);
	}
	
}
class Student extends Person{
	int num;
	Student (){}
	Student (String name ,int age ,String sex,int num){
		super(name,age ,sex);
		this.num=num;
	}
	void showlnfo() {
		System.out.println("姓名："+name+"\n"+"年龄："+age+"\n"+"性别："+sex+"\n"+ "学号："+num);
	}
}
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student student =new Student("张三",18,"男",20190865);
       student.showlnfo();
	}

}
