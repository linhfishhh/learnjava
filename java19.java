package hocjava;
import java.util.Scanner;
public class java19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] Arr=new int[20];
		for(int i=0;i<20;i++) {
			System.out.print("Nhap phan tu thu "+i);
			Arr[i]=sc.nextInt();
		}
		int max=Arr[0];
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]>max) {
				max=Arr[i];
			}
		}
		System.out.print("so lon nhat la: "+ max);
		
	}

}
