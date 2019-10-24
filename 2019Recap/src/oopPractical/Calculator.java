package oopPractical;

public class Calculator {
	
	private int memory;
	
	public int addNumbers(int num1, int num2) {
		
		return num1+num2;
		
	}
	
	public int subtract(int num1, int num2) {
		
		return num1-num2;
		
	}
	
	public int multiply(int num1, int num2) {
		
		return num1*num2;
		
	}
	
	public int divide(int num1, int num2) {
		
		return num1/num2;
		
	}
	
	public double sqrRoot(int num1) {
		
		return Math.sqrt(num1);
		
	}
	
	public int getMemory() {
		
		return memory;
		
	}
	
	public void setMemory(int memory) {
		
		this.memory = memory;
		
	}
	
	public void clearMemory(int memory) {
		
		this.memory = memory;
		
	}
	
}
