package exceptions;

/**
 * Hot chocolate. HR tutorial - day 17 - More Exceptions.
 * @author allen
 * 75 and 85
 */
public class MoreExceptions_HotChoco {
	
	
	public static final double tooHot = 85;
	public static final double tooCold = 75;
	
	public static void drinkHotChocolate(double hotChocoTemp) throws MoreExceptions_TooHotException, MoreExceptions_TooColdException{
		
		if(hotChocoTemp >= tooHot) {
			throw new MoreExceptions_TooHotException();
		} else if(hotChocoTemp <= tooCold) {
			throw new MoreExceptions_TooColdException();
		}
		
	}
	
	public static void main(String[] args) throws MoreExceptions_TooHotException, MoreExceptions_TooColdException{
		
		double currentTemp = 1;
		
		boolean wrongTemp = true;
		while(wrongTemp) {
		
			try {
				drinkHotChocolate(currentTemp);
				System.out.println("Coco was good");
				wrongTemp = false;
			} catch(MoreExceptions_TooHotException e1) {
				System.out.println("too hot!");
				currentTemp = currentTemp - 5;
			} catch(MoreExceptions_TooColdException e2) {
				System.out.println("Too cold!");
				currentTemp = currentTemp + 5;
			}
		
		}
		System.out.println("Andddd it's done.");
		
		
		
		
		/**
		 * What happens if we don't catch an exception?
		 * Run the code below to find out...
		 * 
		 * This should throw an exception at runtime.
		 * 
		 */
		double test2 = 85;
//		try {
			drinkHotChocolate(test2);
			System.out.println("Coco was good");
//		} catch(MoreExceptions_TooHotException e1) {
//			System.out.println("too hot!");
//		} catch(MoreExceptions_TooColdException e2) {
//			System.out.println("Too cold!");
//		}
		
		System.out.println("Coco drank!");
		
	}

}
