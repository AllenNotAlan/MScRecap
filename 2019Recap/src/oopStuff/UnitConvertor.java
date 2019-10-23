package oopStuff;

public class UnitConvertor {
	
	public static double cmToInches(double cms) {
		
		double inch = 0;
		
		//to convert cm to inches
		inch = cms*0.394;
		
		return inch;
	}
	
	public static double inchestToCms(double inches) {
		
		double cms = 0;
		
		//convert inchest to cms
		cms = inches*2.54;
		
		return cms;
	}
	
	public static double kmToMiles(double kms) {
		
		double miles = 0;
		
		//convert kms to miles
		miles = kms*0.621;
		
		return miles;
		
	}
	
	public static double milesToKms(double miles) {
		
		double kms = 0;
		
		//convert miles to kms
		kms = miles*1.609;
		
		return kms;
	}
	
	
}
