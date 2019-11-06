package recursion;

public class RecursionExample {

	public static void main(String[] args) {
		
//		callMe();
		//countDown(10);
		
		/*
		 * Factorial using for loop NOT recursion.
		 */
//		RecursionExample test1 = new RecursionExample();
//		System.out.println(test1.factorialOfNum(5));
//		
//		RecursionExample newTest = new RecursionExample();
//		System.out.println(newTest.fact(4));
		System.out.println(reverseString("Allen"));
		
	}
	
	/**
	 * Method that outputs message to screen then calls itself.
	 */
	public static void callMe() {
		System.out.println("Call me please...");
		callMe();
	}
	
	public static void countDown(int num) {
		if(num<=0) {
			System.out.println();
		} else {
			System.out.println(num);
			countDown(num - 1);
		}
	}
	
	/**
	 * Factorial using for loop NOT recursion.
	 * @param num
	 * @return
	 */
	public int factorialOfNum(int num) {
		
		for(int loop = num-1;loop>1;loop--) {
			num = num*loop;
		}
		
		return num;
	}
	
	public int fact(int num) {
		int result;
		
		if(num == 1) {
			return 1;
		}
		
		result = fact(num-1)*num;
		
		return result;
		
	}
	
	public static String reverseString(String str) {
		System.out.println("In with:"+str);
		
		if(str.length()<2) {
			System.out.println("BASE REACHED");
			return str;
		}
		
		return reverseString(str.substring(1)) +str.charAt(0);
	}
	

}
