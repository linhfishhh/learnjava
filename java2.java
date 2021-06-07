package hocjava;
import java.util.Scanner;
public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float width;
		float height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter width");
		width=sc.nextFloat();
		System.out.println("Enter height");
		height=sc.nextFloat();
		float area=width*height;
		System.out.println(area);
	}

}
