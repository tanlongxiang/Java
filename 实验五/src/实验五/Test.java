package 实验五;

class Fan{	            //父类 
	public int f (int a,int b)  //最大公约数方法
	{   

		for(int i=a;i>0;i--)    //用for循环
		   {
			if(a%i==0&&b%i==0)//如果a,b都能除尽则返回i的值；
			{
				return i;
			}
	      }
	    
		return 0;
   }
         }
class Fanson extends Fan{             //创建子类继承父类
	public int f (int a, int b)   //重写父类方法最小公倍数方法
	{
		 int m=super.f(a, b);     //用super关键字调用父类隐藏方法将值赋给m
		return a*b/m;                //返回最小公倍数
	}
                        }
public class Test {

	public static void main(String[] args) {
		     Fan fan=new Fan();          //创建父类方法调用构造方法
		     System.out.println("最大公约数："+fan.f(12,6));
		     fan=new Fanson();            //父类对象作为子类上转型对象
             System.out.println("最大公倍数："+fan.f(12,6));
	}

}
