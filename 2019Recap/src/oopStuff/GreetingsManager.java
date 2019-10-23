package oopStuff;

/**
 * 
 * @author allen
 *
 */
public class GreetingsManager {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Greetings Manager App ..... start");
		
		//create object of type MessageCentre
		MessageCentre myMessageCentre = new MessageCentre();
		//MessageCentre method invoked
		myMessageCentre.displayWelcomeMessage("am");
		
		System.out.println("Greetings Manager App ..... close");
		
	}
	
}
