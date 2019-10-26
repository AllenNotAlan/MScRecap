package inheritance;

public class Car extends Vehicle {

	private int numberOfWheels;
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + this.getName() + ", powerType=" + this.getPowerType() + ", Number of Wheels="+numberOfWheels+ "]";
	}
	
	/**
	 * Default constructor
	 */
	public Car() {
		
	}

	/**Constructor with Args taken from SUPERCLASS AND ADDED NUMBER OF WHEELS!!1
	 * @param name
	 * @param powerType
	 */
	public Car(String name, String powerType, int numberOfWheels) {
		this.setName(name);
		this.setPowerType(powerType);
		this.numberOfWheels = numberOfWheels;
	}
	
	
	

}
