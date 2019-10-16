package methodsWithPara;

public class MethodsWithPara {

	public static void main(String[] args) {
		
		//create the class
		MethodsWithPara examples = new MethodsWithPara();
		//invoke methods
		examples.areaOfCircle(10);
		examples.areaOfTriangle(10, 10);
		
	}
	
	/*this is an INSTANCE method (it is not static)
	for instance methods, you must create a class to be able to invoke them. See above.
	*/
	public void areaOfCircle (double radius) {
		System.out.println("Area of circle: "+Math.PI*radius*radius);
	}
	
	public void areaOfTriangle(double height, double breadth) {
		System.out.println("Area of triangle: "+ ((height*breadth)/2));
	}

}
