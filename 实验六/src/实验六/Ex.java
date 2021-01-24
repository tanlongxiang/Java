package 实验六;

class DangerException extends Exception{//自定义异常
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String message = "超重";
			public String warnMess(){
		return message;
	}
}
class CargoBoat{          
	int realContent;
	int maxContent;
	public void setMaxContent(int c){   //船最大负载
		maxContent = c;
	}
	public void loading(int m)throws DangerException{ //装货方法自定义抛出异常
		realContent += m;
		if(realContent>maxContent){   //判断是否超重进行异常处理
			throw new DangerException();
		}
		System.out.println("目前装载了"+realContent+"吨货物");
	}
}
public class Ex{
public static void main(String args[]){
	CargoBoat ship = new CargoBoat();
	ship.setMaxContent(1000);
	int m = 600;
	try{        //进行捕捉异常
		ship.loading(m);
		m = 400;
		ship.loading(m);
		m = 367;
		ship.loading(m);
		m = 500;
		ship.loading(m);
	}
	catch(DangerException e){     
		System.out.println(e.warnMess());
		System.out.println("无法再装载重量是"+m+"吨的集装箱");
	}
	finally{
		System.out.printf("货船讲正点启航");
	}
}
}
