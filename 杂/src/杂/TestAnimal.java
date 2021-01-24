package 杂;
class Animal{
  String eat ;
  String move;
  Animal(){}
  Animal(String eat ,String move ){
	  this.eat=eat;
	  this.move=move;
  }

  void sleep() {
	 System.out.println("夜晚睡觉");
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
     Rbbit rbbit=new Rbbit("兔子吃草","兔子跳着走");//
     Tiger tiger=new Tiger("老虎吃肉，吃兔子","老虎正常走路");
     Eagle eagle =new Eagle ("老鹰吃肉，也吃兔子","老鹰会飞");
     rbbit.getEat();rbbit.getMove();rbbit.sleep();
     tiger.getEat();tiger.getMove();tiger.sleep();
     eagle.getEat();eagle.getMove();eagle.sleep();
	}

}
