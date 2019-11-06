package oopPractical2_Constructors;

public class Animal {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Default constructor
	 */
	public Animal() {
		
	}
	
	public Animal(String name) {
		this.name = name;
	}
}
