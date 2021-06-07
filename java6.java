package hocjava;
import java.util.Scanner;
public class java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input weight here!");
		double weight=sc.nextDouble();
		System.out.print("Input height here!");
		double height=sc.nextDouble();
		double bmi=weight/Math.pow(height,2);
		System.out.println("bmi = "+bmi);
		if(bmi<18) {
			System.out.println("Under Weight");
		}
		else if(bmi< 25.0) {
			System.out.println("Normal");
		}
		else if(bmi<30) {
			System.out.println("Over Weight");
		}
		else {
			System.out.println("Obese");
		}
	}

}
