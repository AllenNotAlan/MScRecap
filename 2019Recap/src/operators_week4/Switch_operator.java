package operators_week4;

public class Switch_operator {

	public static void main(String[] args) {
		
		int num=7;
		
//		switch(num) {
//			case 1: 
//				if(num<5) {
//					System.out.println("Num is less than 5");
//				}
//				System.out.println("Value is one");
//				break;
//			case 2: System.out.println("Value is two");
//				break;
//			case 3: System.out.println("Value is three");
//				break;
//			default : System.out.println("Invalid num...");
//		}
		
		switch(num) {
		case 1:
			if(num<5) {
				System.out.println("Num is smaller than 5");
			}
		case 6:
			if(num>5) {
				System.out.println("Num is greater than 5");
			}
		}
		
	}

}
