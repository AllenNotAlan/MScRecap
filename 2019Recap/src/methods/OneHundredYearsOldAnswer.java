package methods;

public class OneHundredYearsOldAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yearTurn100();

	}
	
	public static void yearTurn100() {
		int currentAge, currentYear, yearTurning100;
		
		currentAge = 30;
		yearTurning100 = 0;
		currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		
		yearTurning100 = 100 - currentAge + currentYear;
		System.out.println(yearTurning100);
		
		
	}

}
