package 实验六;
import java.util.*;
class NumberRangeException extends Exception{
	private static final long serialVersionUID = 1L;
	String message;
	NumberRangeException(double score){
		message="分数"+score+"不合理";	
		}
	public String toString() {
		return message;
	}
}
class fenshu{
	Scanner reader=new Scanner(System.in);
	double score=reader.nextDouble();
	void show(double score) throws NumberRangeException{
		if(score>100||score<0) {
			throw new NumberRangeException(score);
		}
			else 
			{
				this.score=score;
			}
		int m=(int)score/10;
		switch(m) {
		case 10:
		case 9:{
			System.out.print("A");
			break;
		}
		case 8:{
			System.out.print("B");
			break;
		}
		case 7:{
			System.out.print("C");
			break;
		}
		case 6:{
			System.out.print("D");
			break;
		}
		default:{
			System.out.print("E");
		}
		}
		}
	}
public class Cwq {
   public static void main(String args[]) {
	   fenshu a=new fenshu();
	   try {
		  a.show(a.score);
	   }
	   catch(NumberRangeException e) {
		   System.out.println(e.toString());
	   }
   }
}

