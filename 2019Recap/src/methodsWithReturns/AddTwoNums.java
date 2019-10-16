package methodsWithReturns;

/**
 * 
 * @author allen
 *
 */
public class AddTwoNums {

	/*
	 * Return method that adds two numbers together, returns them to method and displays to screen.
	 */
	public static void main(String[] args) {
		
		System.out.println("This is a method that adds two nums together and "
				+ "returns them from method & displays them.");
		
		int sum = addNums(10, 10);
		System.out.println(sum);
		
	}
	
	/*
	 * Return method.
	 */
	public static int addNums(int num1, int num2) {
		
		int sum;
		sum = num1 + num2;
		
		return sum;
		
	}

}
