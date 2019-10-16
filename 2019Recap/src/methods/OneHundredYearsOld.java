package methods;

import java.util.Scanner;

public class OneHundredYearsOld {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//while loop is necessary to keep asking until the age given is valid.
		
		while (true) {
		
			System.out.println("Please enter your age: ");
			int yearBorn = scanner.nextInt();
			//input check. Checks if value is valid. Ie not zero or a negative number
			if(yearBorn <= 0) {
				System.out.println("Please enter a valid age.");
			} else {
				hundredIn(yearBorn);
				break;
			}
			
		}
		
		scanner.close();
		
		
	}
	
	public static void hundredIn (int age) {
		
		//declares variables
		int year, yearBorn, hundredYear;
		
		//gets the current year
		year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		
		System.out.println("You are: "+age+" years old.");
		
		//calculates the year you born based on your age. yearBorn - year
		yearBorn = year - age;
		System.out.println("You were born in: "+yearBorn);
		
		//calculates the year you will turn 100. yearBorn + 100
		hundredYear = yearBorn + 100;
		System.out.println("You will be 100 years old in the year: "+hundredYear);
		
		
	}
	
	
	
}
