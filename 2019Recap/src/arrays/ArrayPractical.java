package arrays;

import java.util.Scanner;

public class ArrayPractical {

	public static void main(String[] args) {
		
//		question1();
//		System.out.println();
//		question2();
//		System.out.println();
//		question3();
		
		question5();
		
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

}
