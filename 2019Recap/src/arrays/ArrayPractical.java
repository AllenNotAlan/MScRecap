package arrays;

import java.util.Scanner;

public class ArrayPractical {

	public static void main(String[] args) {
		
		int[] arrayTest = {1,2,3,4,5,6};
		
//		question1();
//		System.out.println();
//		question2();
//		System.out.println();
//		question3();
		
//		question5();
//		question6();
		
//		question7(arrayTest);
		
		//question 8 array1
//		double[] mark1 = new double[5];
//		mark1[0] = 24;
//		mark1[1] = 42;
//		mark1[2] = 29;
//		mark1[3] = 66;
//		mark1[4] = 77;
		
		//question 8 array 2
//		double[] mark2 = {78, 68, 31, 22, 42};
//		
//		double mark1av = question8average(mark1);
//		double mark2av = question8average(mark2);
//		
//		System.out.println("Average of assignment 1: "+mark1av);
//		System.out.println("Average of assignment 2 : "+mark2av);
//		
//		System.out.println("Average of both assignments combined: "+question8OverallAverage(mark1, mark2));
//		
//		System.out.println("Better average is : "+question8BetterAverage(question8average(mark1), question8average(mark2)));
		
		question9();
		
	}
	
	public static void question1() {
		
		final double _rateOfPay_ = 10.25;
		
		int[] weekHours = new int[6];
		
		weekHours[0] = 8;
		weekHours[1] = 7;
		weekHours[2] = 9;
		weekHours[3] = 7;
		weekHours[4] = 4;
		
		double sumOfPay = 0;
		int totalHours = 0;
		
		System.out.printf("%s %s %s %s %s \n","Monday","Tuesday","Wednesday","Thursday","Friday");
		
		for(int loop = 0;loop<weekHours.length;loop++) {
			totalHours+=weekHours[loop];
			System.out.printf("%d        ",weekHours[loop]);
			
		}
		
		//total pay for week: hours x rate of pay
		sumOfPay = totalHours*_rateOfPay_;
		
		System.out.println("\n");
		
		System.out.println("Total hours this week: "+totalHours);
		System.out.println("Rate of pay per hour: £"+_rateOfPay_);
		System.out.println("Weekly pay: £"+sumOfPay);
		
	}
	
	public static void question2() {
		
		double[] temp = {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1};
		
		double sumOfValues = 0;
		double average = 0;
		
		System.out.printf("%s ","Temperatures:");
		
		for(int loop=0;loop<temp.length;loop++) {
			sumOfValues +=temp[loop];
			System.out.printf("%.1f| ",temp[loop]);
		}
		
		average = sumOfValues/temp.length;
		System.out.println();
		System.out.println("Average temp: "+average);
		
		double minTemp = temp[0];
		for(int loop = 0;loop<temp.length;loop++) {
			if(minTemp>temp[loop]) {
				minTemp = temp[loop];
			}
		}
		System.out.println("Minimum temp: "+minTemp);
		
	}
	
	public static void question3() {
		
		double[] heights = new double[4];
		
		heights[0] = 1.4;
		heights[1] = 1.9;
		heights[2] = 1.31;
		heights[3] = 1.2;
		
		
		double sumOfValues = 0;
		double average = 0;
		for(int loop = 0;loop<heights.length;loop++) {
			sumOfValues = sumOfValues + heights[loop];
		}
		
		average = sumOfValues/heights.length;
		System.out.println("Average height: "+average);
		
		double maxHeight = heights[0];
		for(int loop = 0;loop<heights.length;loop++) {
			if(maxHeight<heights[loop]) {
				maxHeight = heights[loop];
			}
			
		}
		System.out.println("Tallest height: "+maxHeight);
		
		double minHeight = heights[0];
		for(int loop = 0;loop<heights.length;loop++) {
			if(minHeight>heights[loop]) {
				minHeight = heights[loop];
			}
		}
		System.out.println("Smallest height: "+minHeight);
	}
	
	public static void question5() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.next();
		
		char[] arr = new char[name.length()];
		
		char a='a',e='e',i='i',o='o',u='u';
		
		int vowelA=0,vowelE=0,vowelI=0,vowelO=0,vowelU=0;
		
		for(int loop=0;loop<arr.length;loop++) {
			arr[loop] = name.charAt(loop);
			System.out.printf("%s",arr[loop]);
			
		}
		
		for(int loop = 0;loop<arr.length;loop++) {
			if(arr[loop] == a) {
				vowelA += 1;
			}
			
			if(arr[loop] == e) {
				vowelE+=1;
			}
			
			if(arr[loop] == i) {
				vowelI+=1;
			}
			
			if(arr[loop] == o) {
				vowelO+=1;
			}
			
			if(arr[loop] == u) {
				vowelU+=1;
			}
		}
		
		System.out.println();
		System.out.println("a:"+vowelA);
		System.out.println("e:"+vowelE);
		System.out.println("i:"+vowelI);
		System.out.println("o:"+vowelO);
		System.out.println("u:"+vowelU);
		
		int sum = vowelA+vowelE+vowelI+vowelO+vowelU;
		
		System.out.println("Total number of vowels: "+sum);
		
		
		
	}
	
	public static void question6() {
		
		int[] oneHundred= new int[101];
		
		int sumOfEvens = 0;
		
		for(int loop = 1;loop<=oneHundred.length;loop++) {
			if(loop%2 == 0) {
				oneHundred[loop]=loop;
				System.out.println(oneHundred[loop]);
				sumOfEvens+=loop;
			}
		}
		
		System.out.println("Sum of all evens: "+sumOfEvens);
		
	}
	
	public static void question7(int[] arr) {
		
//		for(int loop = 0; loop < arr.length; loop++) {
//			System.out.println(arr);
//		}
		
		/*
		 * for each loop to print values within an array
		 */
		for(int nums: arr) {
			System.out.println(nums);
		}
		
	}
	
	
	public static double question8average(double[] arr) {
		
		double average = 0;
		double sumOf = 0;
		
		//find total value
		for(int loop = 0;loop<arr.length;loop++) {
			sumOf = sumOf + arr[loop];
		}
		
		//average
		average = sumOf/arr.length;
		return average;
	}
	
	public static double question8OverallAverage(double[] arr1, double[] arr2) {
		
		int numberOfValues = arr1.length + arr2.length;
		double average = 0;
		double sumOf1 = 0;
		double sumOf2 = 0;
		double totalSum = 0;
		
		//sum of arr1
		for(int loop = 0;loop<arr1.length;loop++) {
			sumOf1 += arr1[loop];
		}
		
		//sum of arr2
		for(int loop = 0;loop<arr2.length;loop++) {
			sumOf2 += arr2[loop];
		}
		
		totalSum = sumOf1 + sumOf2;
		
		average = totalSum/numberOfValues;
		
		return average;
	}
	
	public static double question8BetterAverage(double num1, double num2) {
		
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
		
	}
	
	public static void question9() {
		
		String[] quote = new String[13];
		
		quote[0] = "Continuous";
		quote[1] = "efford";
		quote[2] = "not";
		quote[3] = "strength";
		quote[4] = "nor";
		quote[5] = "intelligence";
		quote[6] = "is";
		quote[7] = "the";
		quote[8] = "key";
		quote[9] = "for";
		quote[10] = "unlocking";
		quote[11]= "our";
		quote[12] = "potential";
		
		//prints quote using for each
		for(String word: quote) {
			System.out.printf("%s ",word);
		}
		
		System.out.println();
		
		//prints the quote using regular for loop
		for(int loop=0;loop<quote.length;loop++) {
			System.out.printf("%s ",quote[loop]);
		}
		System.out.println();
		
		//how many words?
		System.out.println("\nNumber of words in the quote: "+ quote.length);
		
		
		int sumOfLetters = 0;
		
		//new array created containing length of each word
		int[] letterArray = new int[quote.length];
		
		System.out.println("\nLength of each word: ");
		//for loop to print each length of word in the letterArray
		for(int loop = 0;loop<quote.length;loop++) {
			
			char[] a = quote[loop].toCharArray();
			
			letterArray[loop] = a.length;
			System.out.printf("%d, ",letterArray[loop]);
			
			sumOfLetters = sumOfLetters + letterArray[loop];
			
		}
		
		System.out.println("\n");
		
		System.out.println("Number of letters in the quote: "+ sumOfLetters+"\n");
		
		int shortestWord = letterArray[0];
		int longestWord = letterArray[0];
		for(int loop = 0;loop<letterArray.length;loop++) {
			if(shortestWord > letterArray[loop]) {
				shortestWord = letterArray[loop];
			}
			if(letterArray[loop]>longestWord) {
				longestWord = letterArray[loop];
			}
		}
		
		System.out.println("Longest word is "+longestWord+" characters in length.");
		
		System.out.print("The longest word is: ");
		for(int loop = 0;loop<quote.length;loop++) {
			if(quote[loop].length() == longestWord) {
				System.out.println(quote[loop]);
			}
		}
		System.out.println();
		
		System.out.println("Shortest word is "+shortestWord+" characters in length.");
		System.out.print("The shortest word is : ");
		for(int loop = 0;loop<quote.length;loop++) {
			if(quote[loop].length() == shortestWord) {
				System.out.println(quote[loop]);
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
