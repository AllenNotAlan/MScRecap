package arrays;

public class Arrays2Dexercise {

	public static void main(String[] args) {

		Arrays2Dexercise arr2d = new Arrays2Dexercise();
		int[][] arr = arr2d.create2dArray();
		print2dArray(arr);
	}
	
	public int[][] create2dArray(){
		
		int[][] arr = new int[4][3];
		
		int num=2;
		
		for(int row = 0;row<arr.length;row++) {
			
			for(int col = 0; col<arr[row].length;col++) {
				
				arr[row][col] = num;
				num+=2;
				
			}
		}
		
		
		return arr;
		
	}
	
	public static void print2dArray(int[][]arr) {
		
		for(int row = 0;row< arr.length;row++) {
			
			for(int col = 0; col<arr[row].length;col++) {
				System.out.printf("[%d %d] = %d  ",row,col,arr[row][col]);
				
			}
			System.out.println();
		}
		
	}
	

}
