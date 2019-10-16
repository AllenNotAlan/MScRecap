package arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[][] arr2d = new int[2][3];
		
		for(int row = 0;row<arr2d.length;row++) {
			
			for(int col = 0; col<arr2d[row].length;col++) {
				
				arr2d[row][col] = 1;
				System.out.printf("%d \n",arr2d[row][col]);
			}
			System.out.println();
		}
		
		System.out.println(arr2d.length);
		System.out.println(arr2d[0].length);
		
		int[][] arr2 = new int[][] {
			
			new int[4],
			new int[3]
			
		};
		
		for(int row = 0;row<arr2.length;row++) {
			for(int col = 0;col<arr2[row].length;col++) {
				arr2[row][col] = 1;
				System.out.println(arr2[row][col]);
			}
		}
		
		System.out.println();
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
		
		
		
	}

}
