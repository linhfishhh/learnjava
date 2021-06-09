package hocjava;
import java.util.Scanner;
public class java22 {

	public static void main(String[] args) {
		int[] arr=new int[];
		arr[0]=1;
		int[] arr1=new int[arr.length-1];
		int n=9;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so can tim");
		int x=sc.nextInt();
		n=delete(arr,n,x);
		for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

    }
		
	}
	public static int search(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.print("Vi tri cua x: "+ i);
				return i;
			}
		}
		return -1;
	}
	public static int delete(int[] arr,int n, int x) {
		int p=search(arr,x);
		if(p==-1) {
			System.out.print("Khong tim thay phan tu nao");
		}
		for(int i=0;i<n;i++) {
			arr[i]=arr[i+1];
		}
		return n-1;
	}
}
