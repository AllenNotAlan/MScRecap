package oopPractical2_Constructors;

public class WhaleWatcher {

	public static void main(String[] args) {
		
		Whale w1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale w2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale w3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale w4 = new Whale("Humpback", "Atlantic", 919, 13, 13);
		
		Whale[] whaleArr = new Whale[4];
		whaleArr[0] = w1;
		whaleArr[1] = w2;
		whaleArr[2] = w3;
		whaleArr[3] = w4;
		
		printArrDetails(whaleArr);
		whalesInAtlantic(whaleArr);
		System.out.print(fastestWhale(whaleArr));
		System.out.println("\n\nAverage length of whales: "+averageLength(whaleArr)+"m");
		heaviestWhale(whaleArr);
	}
	
	public static void printArrDetails(Whale[] arr) {
		
		for(int loop = 0;loop<arr.length;loop++) {
			System.out.println(arr[loop].toString());
		}
		
	}
	
	public static void whalesInAtlantic(Whale[] arr) {
		
		System.out.println("\nWhales swimming in Atlantic ocean:");
		for(int loop = 0;loop<arr.length;loop++) {
			if(arr[loop].getMainOcean().equalsIgnoreCase("atlantic")) {
				System.out.print(arr[loop].getName()+" ");
			}
		}
		
	}
	
	public static String fastestWhale(Whale[] arr) {
		
		int fastestSpeed = arr[0].getMaxSpeed();
		String fastestWhale = arr[0].getName();
		for(int loop = 0;loop<arr.length;loop++) {
			if(arr[loop].getMaxSpeed()>fastestSpeed) {
				fastestSpeed = arr[loop].getMaxSpeed();
				fastestWhale = arr[loop].getName();
			}
			
		}
		
		System.out.print("\nFastest speed with: "+fastestSpeed+" is the ");
		
		
		return fastestWhale;
	}
	
	public static double averageLength(Whale[] arr) {
		
		double average = 0;
		double sum = 0;
		for(Whale whale: arr) {
			sum += whale.getLength();
		}
		
		average = sum/arr.length;
		
		return average;
	}
	
	public static void heaviestWhale(Whale[] arr) {
		
		int heaviestWeight = arr[0].getWeight();
		for(Whale whale: arr) {
			if(heaviestWeight<whale.getWeight()) {
				heaviestWeight = whale.getWeight();
			}
			
			if(heaviestWeight == whale.getWeight()) {
				System.out.println(whale.getName());
			}
		}
		
		
	}
	
	

}
