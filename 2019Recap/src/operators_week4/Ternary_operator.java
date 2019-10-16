package operators_week4;

public class Ternary_operator {

	public static void main(String[] args) {
		
		int grade;
		grade = 50;
		
		
		// variable X = (expression) ? value if true : value if false
		System.out.println(grade >= 50 ? "MSc passed":"MSc failed");
		
		
		int a,b,max;
		
		a = 2;
		b = 9;
		max = (a>b) ? a:b;
		System.out.println("Max is "+max);
		
		
	}

}
