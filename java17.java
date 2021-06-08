package hocjava;
import java.util.Scanner;
public class java17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=20;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("nhap phan tu thu "+i);
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int j=0;j<arr.length/2;j++) {
			int temp = arr[j];
		    arr[j] = arr[n - 1 - j];
		    arr[n - 1 - j] = temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
