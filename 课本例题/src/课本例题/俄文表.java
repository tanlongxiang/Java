package 课本例题;

public class 俄文表 {

	public static void main(String[] args) {
		char start='А',end='Я';
		char start2='а',end2='я';
		int start1=(int)start,end1=(int)end;
		System.out.println("俄文字母共"+(end1-start1+1)+"位。");
		System.out.println("大写:");
		for (char i=start;i<=end;i++) {	
			System.out.print(i+" ");
		}
		System.out.print("\n");
		System.out.println("小写:");
		for (char j=start2;j<=end2;j++) {	
			System.out.print(j+" ");
		}
	}

}
