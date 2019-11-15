package exceptions;

import java.util.Scanner;

public class HR_Day16_tryCatch {

	public static void main(String[] args) {

		/*
		 * Problem:
		 * 
		 * Read a String S, and print it's integer value; if S cannot be converted to an integer, print Bad String.
		 * You must use the string-to-integer and exception handling constructs built into your submission language.
		 * If you attempt to use loops/conditional statements, you will get a score of 0.
		 * 
		 */
		
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            Integer.parseInt(S); //converts int to integer
            System.out.println(S); // prints the converted S value. (int to Integer)
        } catch (IllegalArgumentException i) { // catch illegal argument i = ie if the input is not an int then return...
        	System.out.println("Bad String");
        } 
        
        in.close();

	}

}
