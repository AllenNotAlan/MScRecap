package oopPractical;

public class Library {

	public static void main(String[] args) {
		
		//book created with default constructor
		Book b1 = new Book();
		b1.setTitle("Harry Potter");
		
		System.out.println(b1.getTitle());
		
		//book object created with constructor with argument
		Book b2 = new Book("Game of Thrones");
		System.out.println(b2.toString());
		
	}

}
