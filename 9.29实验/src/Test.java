class PC{
	CPU cpu;
	HardDisk HD;
	PC(CPU cpu,HardDisk HD){
		this.cpu=cpu;
		this.HD=HD;		
	}
	public void setCUP(CPU c) {
	   
	}
	public void setHardDisk(HardDisk HD) {
		
	}
	public void show() {
		System.out.println("cpuËÙ¶È   "+cpu.getSpeed()+"\n"+
	"HD  "+HD.getAmount());
	}
   	
}
class CPU{
	int speed;
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int m){
		speed=m;
	}
}
class HardDisk{
	int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int m) {
		amount=m;
	}
	
}

public class Test {

	public static void main(String[] args) {
		CPU cpu=new CPU();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(2000);
		HD.setAmount(200);
		PC pc=new PC(cpu,HD);
		pc.setCUP(cpu);
		pc.setHardDisk(HD);
		pc.show();

	}

}
