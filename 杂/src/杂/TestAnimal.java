package ��;
class Animal{
  String eat ;
  String move;
  Animal(){}
  Animal(String eat ,String move ){
	  this.eat=eat;
	  this.move=move;
  }

  void sleep() {
	 System.out.println("ҹ��˯��");
  }
}
class Rbbit extends Animal{
	
	  Rbbit(String eat ,String move){
		  super(eat,move);
		  
	  }
	  void getEat() {  
		  System.out.println(eat);
}
	  void getMove() { 
		  System.out.println(move);
}
}
class Tiger extends Animal{
	  Tiger(String eat ,String move ){
		  super(eat,move);
	  }
	  void getEat() {
		  System.out.println(eat);
		 
	  }
	  void getMove() {  System.out.println(move);
}
}
class Eagle extends Animal{
	 
	  Eagle(String eat ,String move ){
		 super(eat,move);
	  }
	  void getEat() {  System.out.println(eat);
}
	  void getMove() {  System.out.println(move);
}
}
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Rbbit rbbit=new Rbbit("���ӳԲ�","����������");//
     Tiger tiger=new Tiger("�ϻ����⣬������","�ϻ�������·");
     Eagle eagle =new Eagle ("��ӥ���⣬Ҳ������","��ӥ���");
     rbbit.getEat();rbbit.getMove();rbbit.sleep();
     tiger.getEat();tiger.getMove();tiger.sleep();
     eagle.getEat();eagle.getMove();eagle.sleep();
	}

}
