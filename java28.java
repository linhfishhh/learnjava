package hocjava;
import java.util.Scanner;
public class java28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so Luong hoc sinh: ");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			if(i<0 || i>10) {
				System.out.print("nhap diem <0 hoac >10!");
			}else {
			System.out.print("nhap diem cua hs thu "+(i+1)+":");
			arr[i]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			if(i>=5) {
				sum+=1;
			}
		}
		System.out.print("so hoc sinh do la: "+sum);
	}

}
