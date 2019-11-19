package generics_hr;

public class ArrayPractice {

	public static void main(String[] args) {
		
		Integer[] arr1;
		Integer[] arr2 = new Integer[4];
		printArray(arr2);
		
		
	}
	
	/**
	 * E means object. Can be anything. Integer, Character, Object, Person, etc.
	 * @param arr
	 */
	public static <E> void printArray(E[] arr) {
		for(E element: arr) {
			System.out.print(element + " ");
		}
	}
	

}
