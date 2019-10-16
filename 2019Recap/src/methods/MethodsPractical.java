package methods;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class MethodsPractical {

	public static void main(String[] args) {

		//oddOrEven(5);
		
		//char letter;
		//letter = 'A';
		//convertFromUpperToLower(letter);
		
		//is num2 a multiple of num1
		//isMultiple(3, 9);
		
		//randomNums(100);
		
		printNumsAndStars();
		
		//testArray();
		
		//printNumberInWord();
		
		//sumOf(100);
		
		//morningEvening();
		
		
		//System.out.println(areaOfTriangle(5, 5));
		
		//System.out.println(month(2));
		
		//System.out.println(averageOfThree(3, 3, 3));
		
		//System.out.println(gCountry2("Canada"));
		
		//System.out.println(headsOrTails("heads"));
		
	}
	
	public static int oddOrEven(int num) {
		
		int numToCheck;
		numToCheck = num;
		
		if(num % 2 == 0) {
			System.out.println("The number "+numToCheck+" is even");
		} else {
			System.out.println("The number "+numToCheck+" is odd");
		}
		
		return num;
		
	}
	
	public static void convertFromUpperToLower(char letter) {
		
		if(Character.isUpperCase(letter)) {
			System.out.println("Character is in upper case... printing in lower case: "+Character.toLowerCase(letter));
		} else {
			System.out.println("Letter is already in lower case");
		}
		
		
	}
	
	public static void isMultiple(int num1, int num2) {
		
		if(num2 % num1 == 0) {
			System.out.println("num2 is a multiple of num1");
		} else {
			System.out.println("num2 not a multiple of num 1");
		}
			

	}
	
	
	public static void randomNums(int endRange) {
		
		Random randoms = new Random();
		int loop;
		for(loop = 0; loop<10; loop++) {
			System.out.println(randoms.nextInt(endRange));
		}
		
	}
	
	public static void printNumsAndStars() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 5-50:");
		int num = scanner.nextInt();
		
		if(num<5 || num >50) {
			System.out.println("Enter number within range.");
		} else {
			
			
			for(int outer=num;outer>0;outer--) {
				System.out.print(outer + "");
				for(int inner=1;inner<=outer;inner++) {
					System.out.print("*");
				}
				System.out.println();

			}
		}
		
		scanner.close();
		
	}
	
	/*
	 * test method to add all objects in side an 1d array.
	 * 
	 */
	public static void testArray() {
		
		// array initialised
		int[] arr = {10,2,3,5,1};
		
		//sum initialised and valued at 0 (to start);
		int sum = 0;
		//for loop that cycles through the array.
		for(int loop = 0; loop<arr.length; loop++) {
			
			//x is set as the value of each int in position arr[loop]
			int x = arr[loop];
			sum = sum + x;
			
		}
		
		System.out.println(sum);
		
	}
	
	/*
	 * Question 6 print number in word
	 */
	
	public static void printNumberInWord() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int userInput = scanner.nextInt();
		
		switch (userInput) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default: System.out.println("OTHER");
		}
		
//		if(userInput == 1) {
//			System.out.println("One");
//		} else if (userInput == 2) {
//			System.out.println("Two");
//		} else if (userInput == 3) {
//			System.out.println("Three");
//		} else {
//			System.out.println("Other");
//		}
		
		
		scanner.close();
		
	}
	
	public static void sumOf(double upperBound) {
		
		double sum = 0;
		
		for(int loop = 0; loop<=upperBound; loop++) {
			
			double x = loop;
			sum = sum+x;
			
		}
		
		System.out.println(sum);
		
		double average = sum / upperBound;
		System.out.println(average);
		
	}
	
	public static void morningEvening() {	
		
		boolean morning = false;
		
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
//		if(hour > 17) {
//			System.out.println("Good evening");
//		} else {
//			System.out.println("It is not yet evening");
//		}
		
		if(hour<17) {
			morning = true;
		}
		
		if(morning = false) {
			System.out.println("Good morning");
		} else {
			System.out.println("Good evening");
		}
		
	}
	
	public static double areaOfTriangle(double height, double base) {
		
		double area = 0;
		
		//area of a triangle: height x base / 2
		
		area = (height*base)/2;
		
		return area;
		
	}
	
	public static String month (int monthNum) {
		
		String monthName = "";
		
		switch (monthNum) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		default:
			System.out.println("anything over mar");
		}
		
		
		return monthName;
		
	}
	
	public static double averageOfThree(int num1, int num2, int num3) {
		
		double sum = 0;
		double average = 0;
		
		sum = num1+num2+num3;
		
		average = sum/3;
		
		
		return average;
		
		
	}
	
	/**
	 * solution 1 for q2.4: g8country capitals
	 * @param countryName
	 * @return
	 */
	public static String gCountry(String countryName) {
		
		String countryCapital = "";
		
		switch(countryName) {
		case "Canada":
			countryCapital = "Ottawa";
			break;
		case "France":
			countryCapital = "Paris";
			break;
		}
		
		
		return countryCapital;
		
	}
	
	/**
	 * question 2.4 solution 2.
	 * @param countryName
	 * @return
	 */
	public static String gCountry2(String countryName) {
		
		String countryCapital = "";
		
		if(countryName.equalsIgnoreCase("Canada")) {
			countryCapital = "Ottawa";
		}
		
		return countryCapital;
		
	}
	
	public static String headsOrTails(String call) {
		
		String result = "";
		
		Random rand = new Random();
		
		int coin = rand.nextInt(2);
		
		System.out.println("You guessed "+call.toUpperCase());
		
		if(coin == 1) {
			result = "Heads";
			if(call.equalsIgnoreCase("heads")) {
				System.out.println("Correct call!");
			} else {
				System.out.println("Wrong call.");
			}
		} else {
			result = "Tails";
			if(call.equalsIgnoreCase("tals")) {
				System.out.println("Correct Call!");
			} else {
				System.out.println("Wrong call");
			}
		}
		
		
		return result;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
