package oopPractical2_Constructors;

public class AirTrafficControl {

	public static void main(String[] args) {
		
		Flight f1 = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
		Flight f2 = new Flight("BA127","London Heathrow","Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("AA678", "Dublin", "Newwark", 8.5);
		Flight f5 = new Flight("AUS12", "Beijin", "Paris", 19);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		System.out.println(f5.toString());
		
		Flight[] arr = {f1,f2,f3,f4,f5};
		System.out.println();
		System.out.println("Array lets us access spefic detail of flight:");
		System.out.println(arr[1].getDestination());
		
		System.out.println();
		System.out.println("Use a for loop to print out all the details of the flights in the array:");
		
		for(int loop = 0; loop<arr.length;loop++) {
			System.out.println(arr[loop].toString());
		}
		
		System.out.println();
		System.out.println("The flight with the longest duration:");
		Flight longest = arr[0];
		for(int loop = 0; loop<arr.length;loop++) {
			if(longest.getDuration()<arr[loop].getDuration()) {
				longest = arr[loop];
			}
		}
		System.out.println(longest.getFlightNumber()+" with "+longest.getDuration());
		
		System.out.println("\nAll flights to Dublin:");
		for(int loop = 0; loop<arr.length;loop++) {
			if(arr[loop].getDestination().equalsIgnoreCase("Dublin")) {
				System.out.println(arr[loop].getFlightNumber());
			}
		}
	}

}
