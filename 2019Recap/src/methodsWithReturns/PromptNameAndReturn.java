package methodsWithReturns;

import java.util.Scanner;

public class PromptNameAndReturn {

	public static void main(String[] args) {
		
		String userName;
		userName = getName();
		
		
		if (userName.length() == 0) {
			System.out.println("Invalid length.");
		} else {
			System.out.println("Thank you, "+userName+".");
		}
		
		
	}
	
	public static String getName() {
		
		String userName;
		userName = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name? Enter below:");
		userName = scanner.nextLine();
		System.out.println(userName);
		scanner.close();
		
		return userName;
		
	}

}
