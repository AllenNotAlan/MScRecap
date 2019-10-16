package arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		
		double[] allAges = {4.0,5.0,1.0,2.0,24.0};
		
		printToScreenAges(allAges);
		System.out.println(averageAge(allAges));
		maxAge(allAges);
		minAge(allAges);
		
	}
	
	public static void ArrayExercise1() {
		
		double[] shoeSizes = new double[8];
		
		shoeSizes[0] = 11;
		shoeSizes[1] = 10;
		shoeSizes[2] = 10;
		shoeSizes[3] = 9;
		shoeSizes[4] = 11;
		shoeSizes[5] = 9;
		shoeSizes[6] = 11;
		shoeSizes[7] = 8.5;
		
		//total sum of all shoe sizes
		double sum = 0;
		double average = 0;
		
		for(int loop = 0; loop<shoeSizes.length;loop++) {
			
			sum = sum + shoeSizes[loop];
			
		}
		
		average = sum/shoeSizes.length;
		
		System.out.println(sum);
		System.out.println(average);
		
	}
	
	/**
	 * average age of the array
	 * @param arr
	 * @return
	 */
	public static double averageAge(double[] arr) {
		
		double averageAge = 0;
		double sum = 0;
		
		
		for(int loop = 0;loop<arr.length;loop++) {
			
			sum = sum + arr[loop];
			
		}
		
		averageAge = sum/arr.length;
		System.out.print("Average age is "+"");
		
		return averageAge;
		
		
	}
	
	/**
	 * displays the values of an array
	 * @param arr
	 */
	public static void printToScreenAges(double[] arr) {
		
		System.out.printf("%s %10s \n","index", "age");
		
		for(int loop = 0;loop<arr.length;loop++) {
			System.out.printf("%d %13.0f \n",loop, arr[loop]);
		}
		
	}
	
	/**
	 * method to find the max age in an array
	 * @param arr
	 */
	public static void maxAge(double[] arr) {
		
		double max = arr[0];
		
		for(int loop = 0;loop<arr.length;loop++) {
			
			if(max < arr[loop]) {
				max = arr[loop];
			}
			
		}
		System.out.println("\nMax age is "+max);
		
	}
	
	/**
	 * method to find minimum age in an array
	 * @param arr
	 */
	public static void minAge(double[] arr) {
		
		//set min (value you want) to one of the array values
		double min = arr[0];
		
		for(int loop = 0;loop<arr.length;loop++) {
			
			if(min > arr[loop]) {
				min = arr[loop];
			}
			
		}
		
		System.out.println("min age is "+min);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
