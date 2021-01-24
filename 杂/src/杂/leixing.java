package 杂;


class A12 {
	void C()                       //空方法没有返回类型//这个他没有返回的是东西
	{
		System.out.println("daying");   //这里面有打印了 
	}
	
   int B(int i) {       //有类型的方法这个方法执行完之后会return一个值给int
	  //这里面有别的东西 也会执行
	   //我试试打印函数
	  // System.out.println("1");//这个有类型的方法里面可以放打印  里面没有这句话他也会把这个方法执行一遍
	   return i*i; 
   }
   
}
public class leixing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         int p;
		A12 a=new A12();
//          a.B(1);        //他有具体值的     //这里会执行   只是里面没有东西是空的而已
//         p=a.B(2);
//          //这个相当于具体值 这个方法有类型  
//          a.C();
//          System.out.println(a.B(1)+p);//这个还是可以打印  它打印只会执行它retrun的结果   
          //放在打印函数打印方法结果 return i*i; 
	        //两个结果相加了
	      //报错   应该是提示你套娃了     他没有类型所以不要打印用的时候直接对象dian方法
	      a.C();   
	}

}
