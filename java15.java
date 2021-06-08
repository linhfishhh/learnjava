package hocjava;

public class java15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem=0;
		for(int number=0;number<100;number++) {
		 if (number < 2){
	            System.out.println(number + " is not a prime");
	        } else {
	            int i = 2;
	            boolean check = true;
	            while (i <= Math.sqrt(number)) {
	                if (number % i == 0) {
	                    check = false;
	                    break;
	                }
	                i++;
	            }
	            if (check)
	                System.out.println(number + " is a prime");
	            	dem+=1;
	            	if(dem==20) {
	            		break;
	            	}
	    
	        }
		}
	}
}
