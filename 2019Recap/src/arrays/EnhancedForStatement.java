package arrays;

public class EnhancedForStatement {

	public static void main(String[] args) {
		
		/* ALSO CALLED FOR EACH LOOP
		 * Enhanced for statement iterates through the elements of an array WITHOUT
		 * using a loop counter, thus avoiding the possibility of stepping outside the bounds.
		 */
		
		
		int[] arr = {1,9,33,44,12,654};
		
		int total = 0;
		int total2 = 0;
		
		/*
		 * Typically this is how you'd do it with a for loop.
		 */
		for(int loop = 0; loop<arr.length;loop++) {	
			total = total + arr[loop];
		}
		System.out.println("Total using for loop with counter: "+total);
		
		/*
		 * This is the enhanced loop used to get the total.
		 * YOU CAN'T USE THIS METHOD TO ALTER ARRAY VALUES!
		 */
		for(int number:arr) {
			total2 = total2+number;
		}
		System.out.println("Total using a for each statement: "+total2);
		
		//nestedForLoop();
		countDownWStars(50);
		
	}
	
	public static void nestedForLoop() {
		
		String string = "Allen Loyola";
		
		for(int outer = 0; outer<string.length(); outer++) {
			System.out.print(outer+"");
			for(int inner = 0; inner<=outer; inner++) {
				System.out.print(string.charAt(inner));
			}
			System.out.println("");
		}
		
		
	}
	
	public static void countDownWStars(int startNum) {
		
		for(int outer = startNum;outer >= 0;outer--) {
			System.out.print(outer+"");
			for(int inner = 1;inner<=outer;inner++) {
				System.out.printf("%s","*");
			}
			System.out.println();
		}
		
	}

	
	
	
	
	
	
	
	
}
