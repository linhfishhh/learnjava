package hocjava;
import java.util.Scanner;
public class java3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap a");
		double a=sc.nextDouble();
		System.out.println("nhap b");
		double b=sc.nextDouble();
		if(a==0 && b==0) {
			System.out.println("pt vo so nghiem");
		}
		else if(a==0 && b!=0) {
			System.out.println("pt vo nghiem");
		}
		else {
			double x = -b/a;
			System.out.println("nghiem cua pt la: "+x);
		}
		
	}

}
