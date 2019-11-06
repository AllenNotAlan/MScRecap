package p2DryRun;

public class Car {
	
	private String make;
	private String model;
	private int horsePower;
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}
	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		
		if(horsePower>1000 || horsePower<0) {
			this.horsePower = -999;
		} else {
			this.horsePower = horsePower;
		}
	}
	
	public void displayAll() {
		System.out.println("Make: "+ this.make);
		System.out.println("Model: "+ this.model);
		System.out.println("Horse Power: "+ this.horsePower);
		
	}
	
	/**
	 * Default
	 */
	public Car() {
		
	}
	
	/**
	 * Constructor with args
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(String make, String model, int horsePower) {
		this.make = make;
		this.model = model;
		this.setHorsePower(horsePower);
	}
}
