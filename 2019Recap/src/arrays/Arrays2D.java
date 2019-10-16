package arrays;

public class Arrays2D {

	public static void main(String[] args) {
		
		Arrays2D object1 = new Arrays2D();
		int[][] arr = object1.createArray2d();
		
		print2Darray(arr);
		
	}
	
	/**
	 * creates the 2d array
	 * @return
	 */
	public int[][] createArray2d() {
		
		int[][] arr2d = new int[3][4];
		
		for(int rowCounter = 0;rowCounter<arr2d.length;rowCounter++) {
			
			//arr2d[row/counter].length specifies which axis length you want
			for(int colCounter = 0; colCounter<arr2d[rowCounter].length;colCounter++) {
				arr2d[rowCounter][colCounter] = 999;
//				System.out.printf("%d ",arr2d[rowCounter][colCounter]);
			}
			
		}
		
		return arr2d;
		
	}
	
	/**
	 * prints the 2d array
	 * @param arr
	 */
	public static void print2Darray(int[][] arr) {
		
		for(int rowCounter = 0;rowCounter<arr.length;rowCounter++) {
			
			//arr2d[row/counter].length specifies which axis length you want
			for(int colCounter = 0; colCounter<arr[rowCounter].length;colCounter++) {
				System.out.printf("[%d %d] = %d |",rowCounter,colCounter,arr[rowCounter][colCounter]);
//				System.out.printf("%d ",arr2d[rowCounter][colCounter]);
			}
			
			System.out.println();
		}
	}

}
