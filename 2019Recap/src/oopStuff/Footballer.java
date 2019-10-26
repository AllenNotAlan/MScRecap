package oopStuff;

public class Footballer {
	
	private int squadNumber;
	private String name;
	
	public int getSquadNumber() {
		return squadNumber;
	}
	
	public void setSquadNumber(int squadNumber) {
		if(squadNumber > 30 || squadNumber < 1) {
			this.squadNumber = 0;
			System.out.println("Sorry there's problem with your request.");
		} else {
			this.squadNumber = squadNumber;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Footballer() {
		
	}
	
	public Footballer(int squadNumber, String name) {
		
		this.name = name;
		this.squadNumber = squadNumber;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Footballer [squadNumber=" + squadNumber + ", name=" + name + "]";
	}
	
	
	
}
