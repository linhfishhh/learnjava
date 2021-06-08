package hocjava;
import java.util.Scanner;
public class java9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tigia=23000;
		System.out.print("nhap USD:");
		Scanner sc=new Scanner(System.in);
		int usd=sc.nextInt();
		int out=usd*tigia;
		System.out.println("usd=>vnd:"+out);
}

}
