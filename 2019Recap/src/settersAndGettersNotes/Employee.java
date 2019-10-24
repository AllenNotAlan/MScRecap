package settersAndGettersNotes;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeNumber;
	public static int count = 0; //static var
	
	
	/**
	 * constructor with arguments. Sets details including the employee number
	 * @param firstNameP
	 * @param lastNameP
	 */
	public Employee(String firstNameP, String lastNameP) {
		
		//new employee - update count (set globally)
		count++;
		this.firstName = firstNameP;
		this.lastName = lastNameP;
		//set the employee number
		employeeNumber = count;
		
	}
	
	
	/**
	 * Show all details
	 */
	public void displayDetails() {
		System.out.println("Employee [firstName=" + firstName + ", lastName=" + lastName + 
				", employeeNumber=" + employeeNumber + "]");
	}
	
	
	


}
