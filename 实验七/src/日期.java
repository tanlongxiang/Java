import java.time.LocalDate;//本地日期包
import java.time.LocalTime;//本地时间包

public class 日期 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDate dateOne=LocalDate.now();           //创建本地时间对象用来获取本地时间
      System.out.println("本地日期"+dateOne);
      LocalDate dateTwo=LocalDate.of(2021,8,16); //创建一个自定义时间对象
      System.out.println("自定义日期"+dateTwo);
      System.out.println(dateOne+"在"+dateTwo+"之后："+dateOne.isAfter(dateTwo));//进行日期比较是否在之后
      System.out.println(dateOne+"在"+dateTwo+"之前："+dateOne.isBefore(dateTwo));//是否在之前
      System.out.println(dateOne+"在"+dateTwo+"相同："+dateOne.isEqual(dateTwo));//是否相等
      int year=18;
      LocalDate datelater=dateOne.plusYears(-year);     //日期增加方法
      System.out.println(dateOne+" "+year+"年前是：\n"+datelater);
      System.out.println("是"+datelater.getDayOfWeek());  //获取星期方法
      int second=897;
      LocalTime time=LocalTime.now();   //获取本地时间
      System.out.println(time+"再过"+second+"秒是："+time.plusSeconds(second));
	}
}








//import java.util.Calendar;
//import javax.swing.JOptionPane;
// String str=JOptionPane.showInputDialog("请输入第一个年份");
//       int yearOne=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("输入该年的月份");
//       int monthOne=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("请输入该月份的日期");
//       int dayOne=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("请输入第二个年份");
//       int yearTwo=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("请输入该年的月份");
//       int monthTwo=Integer.parseInt(str);
//       str=JOptionPane.showInputDialog("请输入该月份的日期");
//       int dayTwo=Integer.parseInt(str);
//       Calendar cal=Calendar.getInstance();
//       cal.set(yearOne, monthOne, dayOne);
//       long timeOne=cal.getTimeInMillis();