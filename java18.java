package hocjava;
import java.util.Scanner;
public class java18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten hs: ");
		String Name=sc.nextLine();
		String[] arr={"a","b","c","d"};
		boolean isExist=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(Name)) {
				System.out.print(Name+"Nam o vi tri"+i);
				isExist=true;
			}
		}
		if(isExist==false) {
			System.out.print("khong tim thay");
		}
	}

}
