package interfaces;

public class Enemy implements Character{
	
	public String weapon = "Red Lightsaber";
	
	public void attack() {
		System.out.println("Enemy attacks hero!");
	}
	
	public void heal() {
		System.out.println("Enemy heals.");
	}
	
	public String getWeapon() {
		return weapon;
	}
	
}
