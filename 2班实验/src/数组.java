
public class ���� {

	public static void main(String[] args) {
		int c[]=new int[10];
		int b[]=new int[10];
		for(int i=0;i<b.length;i++) {
			b[i]=(int)(Math.random()*100);
		}
		System.out.println("0��100�漴���10������");
		for(int a:b) {
		System.out.print(a+" ");
		}
		int j=0;
		for(int i=b.length;i>0;i--) {
			c[j]=b[i-1];
			j++;
		}
		System.out.println("\n"+"���������");
		for(int h:c) {	
			System.out.print(h+" ");
	}
        for(int i=9;i>0;i--) {
        	for(int k=0;k<i;k++) {
        		if(b[k]>b[k+1]){
        			int temp;
        			temp=b[k];
        		   b[k]=b[k+1];
        		   b[k+1]=temp;
        		}
        	}
        }
        System.out.println("\n"+"ð�������");
        for(int n:b) {
        System.out.print(n+" ");
        }
}
}