package hocjava;
import java.util.Scanner;
public class java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money=1.0;
		int month=1;
		double interestRate=1.0;
		Scanner sc=new Scanner(System.in);
		System.out.print("nhap so tien gui:");
		money=sc.nextDouble();
		System.out.print("nhap thang");
		month=sc.nextInt();
		System.out.print("nhap lai");
		interestRate=sc.nextDouble();
		double totalInterest = 0;
		for(int i = 0; i < month; i++){
		    totalInterest += money * (interestRate/100)/12 * month;
		}
		System.out.println(totalInterest);
	}

}
