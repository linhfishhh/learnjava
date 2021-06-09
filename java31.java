package hocjava;
import java.util.Scanner;
public class java31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="AnhDucDepzaiVCL";
		System.out.print("nhap ky tu can dem: ");
		String a=sc.next();
		char b=a.charAt(0);
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(b==(str.charAt(i))) {
				sum+=1;
			}
		}
		System.out.print(sum);
	}

}
