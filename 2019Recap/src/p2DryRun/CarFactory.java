package p2DryRun;

public class CarFactory {
	
	public static void main(String[] args) {
		
		FamilySaloon fs1 = new FamilySaloon("Audi", "A3", 130, true);
		RallyCar rc1 = new RallyCar("Ferrari", "Maranello", 333, 1.24);
		RallyCar rc2 = new RallyCar("McLaren", "MCL2016", 998, 1.98);
		RallyCar rc3 = new RallyCar("Subaru", "Impreza", 145, 1.98);
		FamilySaloon fs2 = new FamilySaloon("Subaru", "Legacy", 123, true);
		
		Car[] carArray = {fs1, rc1, rc2, rc3, fs2};
		
		leastHorsePower(carArray);
		System.out.println("\n");
		displayAllSubaru(carArray);
		averageHorsePower(carArray);
		
	}
	
	public static void leastHorsePower(Car[] arr) {
		
		System.out.print("Cars with the least horsePower:");
		int leastHorsePower = arr[0].getHorsePower();
		for(int loop = 0; loop<arr.length; loop++) {
			if(leastHorsePower>arr[loop].getHorsePower()) {
				leastHorsePower = arr[loop].getHorsePower();
				System.out.print(" "+arr[loop].getModel());
			}
		}
		
	}
	
	public static void displayAllSubaru(Car[] arr) {
		
		System.out.println("Subaru Cars: ");
		
		for(int loop = 0; loop<arr.length; loop++) {
			if(arr[loop].getMake().equalsIgnoreCase("Subaru")) {
				arr[loop].displayAll();
				System.out.println();
			}
		}
		
	}
	
	public static void averageHorsePower(Car[] arr) {
		
		System.out.println("Average horse power of all cars: ");
		double sum = 0;
		double average = 0;
		for(int loop=0;loop<arr.length;loop++) {
			
			sum += arr[loop].getHorsePower();
			
		}
		
		average = sum/arr.length;
		System.out.printf("%.2f",average);
		
	}
}
