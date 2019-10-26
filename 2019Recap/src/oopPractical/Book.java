package oopPractical;

public class Book {
	
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Book() {
		System.out.println("Creating a book object");
	}
	
	/*
	 * constructor with arguments
	 */
	public Book(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}
