package hocjava;
import java.util.Scanner;
public class java20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap do C: ");
		double c;
		double f;
		int choice;
		do {
			System.out.println("Menu");
			System.out.println("1. C to F");
			System.out.println("2. F to C");
			System.out.println("0. Exit");
			System.out.println("Enter your Choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Input F:");
				f=sc.nextDouble();
				c=(5.0 / 9) * (f - 32);
				System.out.print("F > C: "+c);
				break;
			case 2:
				System.out.println("Input C");
				c=sc.nextDouble();
				f=(9.0 / 5) * c + 32;
				System.out.println("C > F: "+f);
				break;
			case 0:
				System.out.print("Dont!");
				break;
			}
		}while(choice !=0);
	}

}
