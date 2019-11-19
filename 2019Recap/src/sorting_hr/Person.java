package sorting_hr;

import static sorting_hr.HairColour.*;


public class Person {
	
	
	HairColour hairColour = BLACK;
	
	public Person() {
		
	}
	
	
	public static void main(String[] args) {
		
		//alias example
		Person peterParker = new Person();
		Person spiderMan = peterParker;
		
		//changes both hair colour of peterparker and spiderman as they are aliases.
		spiderMan.hairColour = PINK;
		
		System.out.println("Hair colour of peter parker: "+peterParker.hairColour);
		System.out.println("Hair colour of spider man: "+spiderMan.hairColour);
		
	}
	
}
