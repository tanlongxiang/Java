class A {
   double f(double x,double y) {
     return x+y;
   }
}
class B1 extends A {
   double f(int x,int y) {
     return x*y;
  }
}
//public class E {
//public static void main(String args[]) {
//      B b=new B();
//      System.out.println(b.f(3,5));     //【代码1】
//      System.out.println(b.f(3.0,5.0));  //【代码2】
//  }
//}

public class B {
	
	public static void main(String args[]) {
//		A a=new A();
//		System.out.println(a.i);
//		 a.method1();  
//        // A.method1();      
//         A.method2() ;
         B1 b=new B1();
       System.out.println(b.f(3,5));     //【代码1】
       System.out.println(b.f(3.0,5.0));  //【代码2】
	}
}
