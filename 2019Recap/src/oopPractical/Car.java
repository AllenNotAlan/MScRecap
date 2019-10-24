package oopPractical;

public class Car {
	
	private String make;
	private String model;
	private String colour;
	private int numberOfDoors;
	private double engineSize;
	private int maxSpeed;
	private boolean started;
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public double getEngingeSize() {
		return engineSize;
	}
	
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public boolean getStarted() {
		return started;
	}
	
	public void setStarted(boolean started) {
		this.started = started;
	}
	
	public void startCar() {
		this.started = true;
	}
	
	public void stopCar() {
		this.started = false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", colour=" + colour + ", numberOfDoors=" + numberOfDoors
				+ ", engineSize=" + engineSize + ", maxSpeed=" + maxSpeed + ", started=" + started + "]";
	}
	
	
	
	
	
	
	
	
}
