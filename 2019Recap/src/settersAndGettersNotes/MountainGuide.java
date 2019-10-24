package settersAndGettersNotes;

public class MountainGuide {
	
	public static void main(String[] args) {
		
		Mountain m1 = new Mountain();
		m1.setName("Everest");
		m1.setHeight(8848);
		
		Mountain m2 = new Mountain();
		m2.setName("Slieve Donard");
		m2.setHeight(828);
		
		System.out.printf("%s: %dm", m1.getName(),m1.getHeight());
		System.out.println();
		System.out.printf("%s: %dm", m2.getName(),m2.getHeight());
		
	}
}
