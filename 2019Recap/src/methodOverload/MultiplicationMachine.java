package methodOverload;

public class MultiplicationMachine {
	
	
	public int multiplyNums(int num1, int num2) {
		
		return num1*num2;
		
	}
	
	public int multiplyNums(int num1, int num2, int num3) {
		
		return num1*num2*num3;
		
	}
	
	public int multiplyNums(int num1, int num2, int num3, int num4) {
		
		return num1*num2*num3*num4;
		
	}
	
	/**
	 * Default constructor
	 */
	public MultiplicationMachine() {
		
	}
	
}
