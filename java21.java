package hocjava;

public class java21 {

	public static void main(String[] args) {
		int[] arr= {3,6,4,2,7,6,7};
		int min=minValue(arr);
		System.out.print("Gia tri nho nhat la: "+ min);

	}
	public static int minValue(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}

}
