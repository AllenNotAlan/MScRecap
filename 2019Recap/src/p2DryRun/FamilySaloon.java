package p2DryRun;

public class FamilySaloon extends Car {
	
	private boolean metallicPaint;
	
	public boolean isMetallicPaint() {
		return metallicPaint;
	}
	
	public void setMetallicPaint(boolean metallicPaint) {
		this.metallicPaint = metallicPaint;
	}
	
	@Override
	public void displayAll() {
		System.out.println("Family Saloon: ");
		System.out.println("Make: "+ this.getMake());
		System.out.println("Model: "+ this.getModel());
		System.out.println("Horse Power: "+ this.getHorsePower());
		System.out.println("Metallic Paint: "+this.isMetallicPaint());
	}
	
	/**
	 * Default
	 */
	public FamilySaloon() {
		
	}
	
	public FamilySaloon(String make, String model, int horsePower, boolean metallicPaint) {
		super(make,model,horsePower);
		this.metallicPaint = metallicPaint;
	}
	
	
}
