package hocjava;
import java.util.Scanner;
public class java27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5;
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[size];
		System.out.println("nhap so: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.print("so be nhat : "+min);
	}

}
