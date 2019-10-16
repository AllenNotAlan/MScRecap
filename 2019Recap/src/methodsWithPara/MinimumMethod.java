package methodsWithPara;

public class MinimumMethod {

	public static void main(String[] args) {

		minimumVal(6, 2);
		maxVal(10, 2);
		System.out.println(averageVal(2, 4, 4, 1));
		
		//this is an instance method. You must create the object first to call it!
		MinimumMethod example = new MinimumMethod();
		example.yourName("Allen");
		
	}
	
	public static void minimumVal(int num1, int num2) {
		
		if(num1>num2) {
			System.out.println("The minimum value is "+num2);
		} else {
			System.out.println("The minimum value is "+num1);
		}
		
	}
	
	public static void maxVal (int num1, int num2) {
		
		if(num1>num2) {
			System.out.println("The max value is "+num1);
		}else {
			System.out.println("The max value is "+num2);
		}
	}
	
	public static double averageVal(double num1, double num2, double num3, double num4) {
		
		double averageVal;
		
		averageVal = (num1 + num2 + num3 + num4)/4;
		
		return averageVal;
		
	}
	
	public void yourName(String name) {
		System.out.println("Your name is "+name);
	}
}
