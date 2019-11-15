package exceptions;

public class TryCatchPractice {

	public static void main(String[] args) {
		//checked exceptions - at compile time
		//unchecked exceptions - occurs at the time your program is executed
		
		/*
		 * To prevent these errors, use a TRY-CATCH.
		 */
		
		try {
			int[] c = new int[6];
			System.out.println("Element 6 at index 5 = "+c[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown"+e);
		} 
		finally {
			System.out.println("finally clause!");
		}
		
	}

}
