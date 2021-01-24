import java.util.*;
class Time {
	int hour;
	int minute;
	int second;
	Time(){
		long time=(System.currentTimeMillis()+8*60*60*1000)/1000;
		hour =(int)time/3600%24;
		minute=(int)time/60%60;
		second =(int)time%60;
	};
	Time(long haosecond){
	  hour= (int)(haosecond/1000)/3600%24;
	  minute=(int)(haosecond/1000)/60%60;
	  second=(int)(haosecond/1000)%60;
	}
	Time(int Hour,int Minute,int Second){
		hour=Hour;
		minute=Minute;
		second=Second;
	}
	public void setTime(long elapseTime) {
		hour= (int)(elapseTime/1000)/3600%24;
		  minute=(int)(elapseTime/1000)/60%60;
		  second=(int)(elapseTime/1000)%60;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second ;
	}
}
public class TestTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 long Stime=sc.nextLong();
        // Time time1=new Time();
         Time time2=new Time(Stime);
         System.out.println("Hour: "+time2.hour+" Minute: "+time2.minute+" Second: "+time2.second);
	 sc.close();
	}

}
