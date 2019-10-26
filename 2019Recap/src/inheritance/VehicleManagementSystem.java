package inheritance;

public class VehicleManagementSystem {

	public static void main(String[] args) {
		
		
		Car c1 = new Car("Ford", "1.4", 4);
		System.out.println(c1.toString());
		
		Ship s1 = new Ship("Speed Boat", "Really fast", 10);
		System.out.println(s1.toString());
		
		
	}

}
