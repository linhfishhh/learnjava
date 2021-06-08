package hocjava;
import java.util.Scanner;
public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhap so: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a/100;
		switch(b) {
		case 1:
			System.out.print("One hundred");
			break;
		case 2:
			System.out.print("two hundred");
			break;
		case 3:
			System.out.print("There hundred");
			break;
		case 4:
			System.out.print("Four hundred");
			break;
		case 5:
			System.out.print("Five hundred");
			break;
		case 6:
			System.out.print("six hundred");
			break;
		case 7:
			System.out.print("Seven hundred");
			break;
		case 8:
			System.out.print("Eight hundred");
			break;
		case 9:
			System.out.print("Nine hundred");
			break;
		}
	}
}
