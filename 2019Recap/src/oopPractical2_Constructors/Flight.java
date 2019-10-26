package oopPractical2_Constructors;

public class Flight {
	private String flightNumber;
	private String destination;
	private String origin;
	private double duration;
	
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}
	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		
		if(duration<=18) {
			this.duration = duration;
		} else {
			this.duration = 0;
			System.out.println("Duration too long, not valid");
		}
	}
	
	public String toString() {
		return "Flight Number: "+flightNumber+", Destination: "+destination +", Origin: "+ origin + ", Duration: "+duration;
	}
	
	/**
	 * Default Constructor
	 */
	public Flight() {
		
	}
	
	/**
	 * Constructor with args
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		this.setDuration(duration);
	}
	
	
}
