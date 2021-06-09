package hocjava;
import java.util.Scanner;
public class java24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int[] arr=new int[n];
		arr[0]=3;
		arr[1]=6;
		arr[2]=2;
		arr[3]=5;
		int c=4;
		System.out.println("Nhap vao vi tri muon chen: ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("nhap so muon them");
		int b=sc.nextInt();
		for(int i=c;i>=x;i--) {
			arr[i]=arr[i-1];
	
		}
		arr[x]=b;
		for(int i=0;i<=c;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
