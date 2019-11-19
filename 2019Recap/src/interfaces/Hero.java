package interfaces;

public class Hero implements Character{
	
	public String weapon = "Lightsaber";
	
	public void attack() {
		System.out.println("Hero attacks enemy!");
	}
	
	public void heal() {
		System.out.println("Hero heals.");
	}
	
	public String getWeapon() {
		return weapon;
	}
	
}
