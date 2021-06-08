package hocjava;

public class java16 {

	public static void main(String[] args) {
		for(int input=3;input<100;input++) {
		int i=2;

		boolean check=true;
		while(i<=Math.sqrt(input)) {
			if(input %i ==0) {
				check=false;
				break;
			}
			i++;
		}
		
		if(check) {
			System.out.println(input+" is Prime");
		}
	}

}
	}
