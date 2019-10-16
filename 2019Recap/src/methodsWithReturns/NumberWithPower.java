package methodsWithReturns;

import java.util.Scanner;

public class NumberWithPower {

	public static void main(String[] args) {
		
		double num, pow;
		
		System.out.println("This programme finds the exponent of a number.");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What number would you like to see?:");
		num = scanner.nextDouble();
		System.out.println("What power?");
		pow = scanner.nextDouble();
		
		System.out.println("The answer is: "+exponentCalc(num, pow));
		
		scanner.close();
		
		
	}
	
	public static double exponentCalc(double num, double pow) {
		
		double answer;
		answer = Math.pow(num, pow);
		System.out.println(answer);
		
		return answer;
		
	}

}
