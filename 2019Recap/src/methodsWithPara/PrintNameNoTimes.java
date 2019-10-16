package methodsWithPara;

public class PrintNameNoTimes {

	public static void main(String[] args) {
		
		printName("Allen", 10);
	}
	
	public static void printName (String yourName, int noTimes) {
		
		
		int loop;
		for(loop = 1; loop<=noTimes;loop++) {
			System.out.println("Your name is: "+yourName);
		}
		
	}

}
