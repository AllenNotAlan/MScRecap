package oopStuff;

public class BuilderHelperApp {
	
	public static void main(String[] args) {
		
		UnitConvertor convert1 = new UnitConvertor();
		
		System.out.printf("%s %.2f %s","10cm in inches is: ",convert1.cmToInches(10),"inches");
		
		
		
	}
}
