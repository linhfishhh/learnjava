package hocjava;
import java.util.Scanner;
public class java14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=-1;
		Scanner sc=new Scanner(System.in);
		while(choice!=0) {
			System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice) {
            case 1:
            	for(int i=0;i<3;i++) {
            		for(int j=0;j<10;j++) {
            			System.out.print("*");
            		}
            		System.out.println();
            	}
            case 2:
            	for(int i=0;i<10;i++) {
            		for(int j=0;j<i;j++) {
            			System.out.print("*");
            		}
            		System.out.println();
            }
            default:
                System.out.println("No choice!");
 
            

		}
		
	}

}
}
