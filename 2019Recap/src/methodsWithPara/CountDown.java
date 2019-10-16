package methodsWithPara;

public class CountDown {

	public static void main(String[] args) {

		
		countDown(9,4);
		
	}
	
	public static void countDown(int start, int end) {
		
		int loop;
		for(loop = start; loop >= end; loop--) {
			System.out.println(loop);
		}
		
	}

}
