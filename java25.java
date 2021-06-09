package hocjava;

public class java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,3,5,7};
		int[] arr2= {2,4,6,8};
		int[] arr3=new int[8];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr2.length+i]=arr2[i];
		}
		for(int i=0;i<arr1.length+arr2.length;i++) {
			System.out.println(arr3[i]+" ");
		}

	}

}
