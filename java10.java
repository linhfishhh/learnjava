package hocjava;
import java.util.Scanner;
public class java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap so");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		if(input <2) {
			System.out.print(input+" is Not Prime");
		}
		else {
			int i=2;
			boolean check=true;
			while(i<=Math.sqrt(input)) {
				if(input %i ==0) {
					check=false;
					break;
				}
				i++;
			}
			if(check) {
				System.out.print(input+" is Prime");
			}
			else {
				System.out.println(input+"is Not Prime");
			}
		}
		}
	}
