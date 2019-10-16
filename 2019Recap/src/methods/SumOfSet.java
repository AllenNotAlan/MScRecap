package methods;

import java.util.Scanner;

public class SumOfSet {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("First: ");
		int startInt = scanner.nextInt();
		System.out.println("Last: ");
		int endInt = scanner.nextInt();
		
		int sum = 0;		
		while(startInt<=endInt) {
			sum = sum+startInt;
			startInt++;
		}
		System.out.println("sum:"+sum);
		
		scanner.close();
		
		invokeMe();
		
	}
	
	public static void invokeMe() {
		System.out.println("Ouch, that hurt!");
	}

}
