package oopStuff;

/**
 * Class to respond with appropriate messages on method call
 * @author allen
 *
 */
public class MessageCentre {
	
	/**
	 * Method that prints to screen a welcome message
	 * 
	 */
	public void displayWelcomeMessage(String timeOfDay) {
		
		String message;
		message = "Hello ";
		
		if(timeOfDay.equalsIgnoreCase("am")) {
			message+="and good morning";
		} else if (timeOfDay.equalsIgnoreCase("pm")) {
			message+="and good afternoon";
		} else {
			message+="and good day";
		}
		
		System.out.println(message);
		
	}//end of method
}// end of class
