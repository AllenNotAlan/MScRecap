package methodOverload;

public class Calculator {
	
	public static void main(String[] args) {
		
		MultiplicationMachine m1 = new MultiplicationMachine();
		m1.multiplyNums(1, 2);
		System.out.println(m1.multiplyNums(1, 2));
		
	}
}
