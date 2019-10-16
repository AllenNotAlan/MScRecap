package arrays;

public class ArraysBasics {

	public static void main(String[] args) {
		
		//initialiseArr2();
		
		int[] testArray = new int[5];
		
		for(int loop = 0;loop<testArray.length;loop++) {
			testArray[loop] = 2*loop;
		}
		
		arrayMethod(testArray);
		System.out.println();
		testAlgo(testArray, 3);
		
	}
	
	public static void initialiseArr1() {
		
		//this is method one of initialising an array. [5] indicates the length of the array.
		int[] arr = new int[5];
		
		//sets the index values.
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 11;
		arr[4] = 78;
		
		
	}
	
	public static void initialiseArr2() {
		
		//this is method two of initialising an array. the length of the initialiser is the length of the array
		int[] arr = {1,3,4,10};
		
		
		System.out.printf("%s %5s \n","index","value");
		//how to print values of the array
		for(int loop = 0;loop<arr.length;loop++) {
			System.out.printf("%d %8d \n",loop,arr[loop]);
		}
		
		
	}
	
	public static void arrayMethod(int[] arr) {
		
		System.out.printf("%s %5s \n","index","value");
		
		for(int loop = 0; loop<arr.length;loop++) {
			System.out.printf("%d %7d \n", loop,arr[loop]);
		}
		
		
	}
	
	public static int testAlgo(int[] arr, int key) {
		
		boolean found = false;
		
		int loop;
		for(loop = 0; loop<arr.length;loop++) {
			if(arr[loop] == key) {
				found = true;
				break;
			}
		}
			
			if(found == true) {
				System.out.printf("%s %2d","number found in array position: ", loop);
				return 1;
			} else {
				System.out.printf("%s","key not found in array.");
				return -1;
			}
		
		
	}

}
