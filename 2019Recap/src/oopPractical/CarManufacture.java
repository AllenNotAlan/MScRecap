package oopPractical;

public class CarManufacture {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setMake("Ford");
		c1.setModel("Fiesta");
		c1.setColour("Blue");
		c1.setNumberOfDoors(4);
		c1.setEngineSize(1.2);
		c1.setMaxSpeed(110);
		c1.startCar();
		c1.stopCar();
		
		System.out.println(c1.toString());
		
	}

}
