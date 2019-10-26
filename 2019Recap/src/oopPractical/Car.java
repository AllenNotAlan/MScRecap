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

	/**
	 * Constructor with args. This overrides the default constructor IF one is not manually created.
	 * @param make
	 * @param model
	 * @param colour
	 * @param numberOfDoors
	 * @param engineSize
	 * @param maxSpeed
	 * @param started
	 */
	public Car(String make, String model, String colour, int numberOfDoors, double engineSize, int maxSpeed,
			boolean started) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.numberOfDoors = numberOfDoors;
		this.engineSize = engineSize;
		this.maxSpeed = maxSpeed;
		this.started = started;
	}
	
	/*
	 * This is a default constructor
	 */
	public Car() {
		
	}
	
	
	
	
	
	
	
	
}
