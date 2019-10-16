package methods;

import java.util.Scanner;

public class MethodAskForName {

	public static void main(String[] args) {
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scanner.nextLine();
		yourName(name);
		
		scanner.close();
		
	}
	
	public static void yourName(String name) {
		
		
		int loop;
		for(loop = 1;loop<=10;loop++) {
			System.out.println("Your name is "+name);
		}
		
	}

}
