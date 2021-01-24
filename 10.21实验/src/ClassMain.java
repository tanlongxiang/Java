class GrandFather{
	 private String name;   //声明私有变量
	 private int age ;
	GrandFather(String name ,int age){  //构造放法方法名字要和类名字相同
		this.name=name;//setName(name);   //这里可以用关键字来对全局变量赋值，也可在下面设置set方法，
		this.age=age;//setAge(age);            在这里调用set方法对全局变量赋值
	}
	//public void setName(String name){   //如果设置set方法就是这些
	//	this.name=name;
	//}
	//public void setAge(int age){
	//	this.age=age;
//	}
	public String getName() {            //这里设置get方法
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void getGrangFather() {        //这是显示爷爷信息的方法，里面调用了上面的get方法，
		System.out.println("爷爷的姓名："+getName()+"  "+"年龄："+getAge());//这里选择打印输出也可用return来返回字符串输出
	}
}
class Father extends GrandFather{     //创建子类继承父类
	  private String occupation;       //增加新的属性
	Father(String name,int age,String occupation){  //构造方法
		super(name,age);     //这里要用到父类的构造方法，但构造方法不能被继承，所以通过关键字进行调用
		this.occupation=occupation;//setOccupation(occupation);  //这里职业进行赋值同上面同样可以用两种方法
	}
    public String getOccupation() {  
    	return this.occupation;
    }
    public void getFather() {     //显示父亲的信息
    	System.out.println("父亲的姓名："+getName()+"  年龄："
           +getAge()+"  "+"职业："+getOccupation());
    }
}
public class ClassMain {
      
	public static void main(String[] args) {  
		GrandFather GF=new GrandFather("wuzongyao",78); //创建对象属于父类方法调用创造的构造方法
		Father F=new Father("wushengguang",48,"工人");//创建对象属于子类调用构造方法
        GF.getGrangFather();       //调用输出方法
        F.getFather();
	}

}
