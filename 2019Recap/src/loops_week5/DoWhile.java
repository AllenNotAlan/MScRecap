package loops_week5;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int option;
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("Menu......");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.println("Enter option:");

			option = scanner.nextInt();
			
			if(option==1) {
				System.out.println("You chose File");
			} else if (option == 2) {
				System.out.println("You chose Edit");
			} else if (option == 3) {
				System.out.println("You chose Delete");
			} else if (option == 4) {
				System.out.println("You chose Exit");
			} else {
				System.out.println("Invalid option. Try again.");
			}
			
		} while(option != 4);
		
	}

}
