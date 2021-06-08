package hocjava;
import java.util.Scanner;
public class java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap a");
		a=sc.nextInt();
		System.out.print("nhap b");
		b=sc.nextInt();
		if(a==0 || b==0) {
			System.out.println("No greatest common factor");
		}
		while(a!=b){
			if(a>b) {
				a-=b;
			}else {
				b-=a;
			}
		}
		System.out.println("Greatest common factor: " + a);
	}

}
