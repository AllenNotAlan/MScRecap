package oopPractical;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		int test1 = c1.addNumbers(1, 2);
		
		c1.setMemory(test1);
		System.out.println(c1.getMemory());
	}

}
