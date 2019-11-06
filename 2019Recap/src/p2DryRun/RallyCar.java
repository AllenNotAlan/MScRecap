package p2DryRun;

public class RallyCar extends Car{

	private double area;
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void displayAll() {
		System.out.println("Rally Car: ");
		System.out.println("Make: "+ this.getMake());
		System.out.println("Model: "+ this.getModel());
		System.out.println("Horse Power: "+ this.getHorsePower());
		System.out.println("Area: "+this.getArea());
	}
	
	public RallyCar() {
		
	}
	
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make,model,horsePower);
		this.area = area;
	}
	
}
