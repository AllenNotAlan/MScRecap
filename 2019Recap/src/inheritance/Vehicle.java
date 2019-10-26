package inheritance;

public class Vehicle {
	
	private String name;
	private String powerType;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPowerType() {
		return powerType;
	}
	
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", powerType=" + powerType + "]";
	}
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String powerType) {
		this.name = name;
		this.powerType = powerType;
	}
	
	
	
}
