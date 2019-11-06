package oopPractical2_Constructors;

public class CityAdmin {
	
	
	public static void main(String[] args) {
		
		City c1 = new City("Beijing", 11, true, "China");
		City c2 = new City("Madrid", 5, true, "Spain");
		City c3 = new City("Rome", 6, true, "Italy");
		City c4 = new City("New York", 8, true, "USA");
		City c5 = new City("Washington", 2, true, "USA");
		City c6 = new City("Dallas", 3, false, "USA");
		
		City[] cities = {c1,c2,c3,c4,c5,c6};
		
		printAllDetails(cities);
		
		leastPopulation(cities);
		
		capitals(cities);
		
		citiesInUsa(cities);
		
		System.out.println("\n");
		System.out.printf("%.2f",averagePopulation(cities));
		
	}
	/**
	 * method to print all details to screen
	 * @param arr
	 */
	public static void printAllDetails(City[] arr) {
		
		for(City city: arr) {
			System.out.println(city.toString());
		}
	}
	
	/**
	 * method to show city with least population
	 * @param arr
	 */
	public static void leastPopulation(City[] arr) {
		int smallestPop = arr[0].getPopulation();
		String cityWithLeastPop = arr[0].getCityName();
		for(City city: arr) {
			if(smallestPop>city.getPopulation()) {
				smallestPop = city.getPopulation();
				cityWithLeastPop = city.getCityName();
			}
		}
		
		System.out.println("\nLeast Population: " + cityWithLeastPop+ " with "+smallestPop+"m");
	}
	
	public static void capitals(City[] arr) {
		
		System.out.println("\nAll the capitals:");
		for(int loop = 0; loop<arr.length;loop++) {
			if(arr[loop].isCountryCapital()) {
				System.out.printf("%s in %s |",arr[loop].getCityName(),arr[loop].getCountry());
			}
		}
		
	}
	
	public static void citiesInUsa(City[] arr) {
		
		System.out.println("\n\nCities in the USA: ");
		for(int loop = 0; loop<arr.length;loop++) {
			if(arr[loop].getCountry().equalsIgnoreCase("usa")) {
				System.out.printf("%s |", arr[loop].getCityName());
			}
		}
		
		
	}
	
	public static double averagePopulation(City[] arr) {
		
		System.out.println("Average population:");
		
		double average = 0;
		double sum = 0;
		
		for(int loop = 0;loop<arr.length;loop++) {
			sum += arr[loop].getPopulation();
		}
		
		average = sum/arr.length;
		
		
		return average;
		
	}
	
}
