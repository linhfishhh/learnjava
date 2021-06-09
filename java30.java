package hocjava;
import java.util.Scanner;
public class java30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("nhap phan thu thu "+j+"cua mang "+i);
				arr[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int k=0;k<arr.length;k++) {
			for(int h=0;h<arr[k].length;h++) {
				if(k==h) {
					sum+=arr[k][h];
				}
			}
		}
		System.out.print(sum);
	}
}
