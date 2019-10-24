package settersAndGettersNotes;

public class StudentRecordManager {
	
	public static void main(String[] args) {
		
		//create a student - s1
		Student s1 = new Student();
		s1.setName("Allen Loyola");
		
		//create another student -s2
		Student s2 = new Student();
		s2.setName("Rachel Barkley");
		
		//show details of the students
		System.out.println("Student 1 is called: "+s1.getName());
		System.out.println("Student 2 is called: "+s2.getName());
	}
	
}
