package hocjava;
import java.util.Scanner;
public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("nhap thang :");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		switch(month) {
		case 2:
			System.out.println("co 28 hoac 29 ngay");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("co 30 ngay");
			break;
		default:
			System.out.print("invalid input");
			break;
		}
	}

}
