package ʵ����;

class DangerException extends Exception{//�Զ����쳣
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String message = "����";
			public String warnMess(){
		return message;
	}
}
class CargoBoat{          
	int realContent;
	int maxContent;
	public void setMaxContent(int c){   //�������
		maxContent = c;
	}
	public void loading(int m)throws DangerException{ //װ�������Զ����׳��쳣
		realContent += m;
		if(realContent>maxContent){   //�ж��Ƿ��ؽ����쳣����
			throw new DangerException();
		}
		System.out.println("Ŀǰװ����"+realContent+"�ֻ���");
	}
}
public class Ex{
public static void main(String args[]){
	CargoBoat ship = new CargoBoat();
	ship.setMaxContent(1000);
	int m = 600;
	try{        //���в�׽�쳣
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
		System.out.println("�޷���װ��������"+m+"�ֵļ�װ��");
	}
	finally{
		System.out.printf("��������������");
	}
}
}
