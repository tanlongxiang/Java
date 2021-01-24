package ¿Î±¾ÀıÌâ;
import java.util.Scanner;
public class Test {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N,S=0;
    int j=1;
    N=sc.nextInt();
    for(int i=1;i<=N;i++){
        j=i*j;
        S=S+j;
        
    }
    System.out.println(S);
    sc.close();
    }
}
