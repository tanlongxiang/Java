class Vehicle {
	double speed;         
	int power;
	void speedUp   (int s) {
	  speed=speed+s;
	}
	void speedDown (int d) {
	  speed=speed-d;
	}
	void setPower (int p)  {
		power=p;
	}
	int getPower ()       {
	  	return power;
	}
	double getSpeed ()       {
	    return speed;
	}
	}
	
public class User {

	public static void main(String[] args) {
		Vehicle car1,car2;        
		car1=new Vehicle();
		car2=new Vehicle();
		car1.setPower(128);
		car2.setPower(76);
		System.out.println("car1�Ĺ����ǣ�"+car1.getPower());
        System.out.println("car2�Ĺ����ǣ�"+car2.getPower());
	        car1.speedUp(80);
	        car2.speedUp(100);
	    System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());
	    System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
	        car1.speedDown(10);
	        car2.speedDown(20);
	    System.out.println("car1Ŀǰ���ٶȣ�"+car1.getSpeed());    
	    System.out.println("car2Ŀǰ���ٶȣ�"+car2.getSpeed());
	    
	}  

}
