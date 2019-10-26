package inheritance;

public class Ship extends Vehicle {
	
	private int tonnage;
	
	public int getTonnage() {
		return tonnage;
	}
	
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	@Override
	public String toString() {
		return "Ship [name=" + this.getName() + ", powerType=" + this.getPowerType() +", Tonnage="+ tonnage + "]";
	}
	
	public Ship() {
		// TODO Auto-generated constructor stub
	}

	public Ship(String name, String powerType,int tonnage) {
		this.setName(name);
		this.setPowerType(powerType);
		this.tonnage = tonnage;
	}

}
