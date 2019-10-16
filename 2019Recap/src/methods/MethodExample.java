package methods;

public class MethodExample {

	public static void main(String[] args) {
		//this is a method. Statement goes here.
		
		//calls and performs the invokeMe method.
		//this method was called directly as it's a static method.
		invokeMe();
		myName();
		myName10();
		
	}
	
	
	
	//example method. simple one.
	public static void invokeMe() {
		System.out.println("You have called a method.");
	}

	public static void myName() {
		System.out.println("My name is Allen.");
		
	}
	
	public static void myName10() {
		
		int loop;
		for(loop = 1; loop<=10; loop++) {
			System.out.println(loop+"."+"My Name is Allen");
		}
		
	}
}
