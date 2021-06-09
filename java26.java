package hocjava;

public class java26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,20,5,4},{3,5,10,3},{2,50,7,9}};
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
		}
		System.out.print(max);
	}

}
