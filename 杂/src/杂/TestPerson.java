package ��;
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
		System.out.println("������"+name+"  ���䣺"+age+" �Ա�"+sex);
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
		System.out.println("������"+name+"\n"+"���䣺"+age+"\n"+"�Ա�"+sex+"\n"+ "ѧ�ţ�"+num);
	}
}
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student student =new Student("����",18,"��",20190865);
       student.showlnfo();
	}

}
