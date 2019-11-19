package interfaces;

import java.util.Random;

public class InterFacesMain {

	public static Character randomCharacter() {
		Random rand = new Random();
		if(Math.abs(rand.nextInt()) % 2 == 0) {
			return new Hero();
		} else {
			return new Enemy();
		}
		
	}
	
	public static void main(String[] args) {
		
		Enemy darthVader = new Enemy();
		Hero lukeSkywalker = new Hero();
		
		darthVader.attack();
		lukeSkywalker.heal();
		lukeSkywalker.attack();
		darthVader.heal();
		
		System.out.println("Luke Skywalker weapon: "+lukeSkywalker.getWeapon());
		System.out.println("Darth Vader weapon:"+darthVader.getWeapon());
		
		Character randomCharacter = randomCharacter();
		randomCharacter.attack();
		randomCharacter.heal();
		
		
	}

}
