package hocjava;
import java.util.Scanner;
public class java29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("nhap vao phan tu thu "+j+" cua mang " +i);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print("nhap vao thu tu cua mot cot");
		int a=sc.nextInt();
		int sum=0;
		for(int i=0;i<arr[a].length;i++) {
			sum+=arr[a][i];
		}
		System.out.print("tong cua "+a+": "+sum);
	}

}
