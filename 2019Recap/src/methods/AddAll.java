package methods;

public class AddAll {

	public static void main(String[] args) {
		
//		//similar to sumOfAll() but this uses a while loop.
//		sumOfAll100();
//		
//		//sum of all integers that are a multiple of 3 OR 5.
//		sumOfAllIntegersMultiplesOf3and5();
//		
//		//sum of all integers between 1 and the paramater chosen
//		sumOfAll(10);
		
		//fibNums();
		fibNumsWhile();
		//fibSol();
	}
	
	/**
	 * Sum of all integers 1 to 100.
	 */
	public static void sumOfAll100() {
		int end = 10;
		int start = 1;
		int sum = 0;
		while (start <= end) {
			
			sum = sum+start;
			start++;
			
		}
		System.out.println(sum);
	}
	
	public static void sumOfAllIntegersMultiplesOf3and5() {
		
		int end = 1000;
		int start = 0;
			
		
		int loop;
		int sum = 0;
		for(loop = start; loop<end; loop++) {
			
			if(loop%3==0 || loop%5 == 0) {
				int nextNum = loop;
				sum = nextNum + sum;
				
			}
			
		}
		System.out.println(sum);
		
		
		
	}
	
	public static int sumOfAll(int end) {
		
		int start, sumOfAll;
		
		sumOfAll = 0;
		start = 1;
		
		
		int loop;
		for(loop = start; loop<=end;loop++) {
			sumOfAll = sumOfAll+loop;
		}
		System.out.println(sumOfAll);
		
		return sumOfAll;
	}
	
	public static void fibNums() {
		
		int loop, start, next, end;
		
		start = 0;
		next = 1;
		end = 10;
		
		int sum, nextSum;
		sum = 0;
		nextSum = 0;
		
		for(loop = start; sum < 4000000; loop++) {
			
			
			sum = start + next;
			start = next;
			next = sum;
			
			
			System.out.println(start);
		}
		
	}
	
	public static void fibNumsWhile() {
		
		long start, next, sum;
		
		start = 0;
		next = 1;
		sum = 0;
		
		while (start <= 4000000) {
			
			if(start % 2 == 0) {
				sum = sum + start;
			}
			long nextNum = next + start;
			start = next;
			next = nextNum;
			
			
		}
		System.out.println(sum);
		
		
	}
	
	public static void fibSol() {
		int sum = 0;
		int x = 0;  // Represents the current Fibonacci number being processed
		int y = 1;  // Represents the next Fibonacci number in the sequence
		while (x <= 4000000) {
			if (x % 2 == 0) {
				sum += x;
			}
			int z = x + y;
			x = y;
			y = z;
		}
		System.out.println(sum);
	
	
	}	
	
	
	
	

}
