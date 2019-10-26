package oopStuff;

public class FootballTeam {

	public static void main(String[] args) {

		
		Footballer f1 = new Footballer();
		f1.setName("Ronaldo");
		f1.setSquadNumber(31);
		
		System.out.println(f1.toString());
		
		Footballer f2 = new Footballer(11, "Bale");
		System.out.println(f2.toString());
	}

}
