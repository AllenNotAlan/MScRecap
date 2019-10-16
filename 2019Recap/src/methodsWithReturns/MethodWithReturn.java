package methodsWithReturns;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		int whichIsBigger = biggestNumber(5, 1);
		System.out.println(whichIsBigger);
		
	}
	
	public static int biggestNumber(int num1, int num2) {
		
		int biggestNumber;
		
		if(num1>num2) {
			biggestNumber = num1;
		} else {
			biggestNumber = num2;
		}
		
		return biggestNumber;
	}

}
