package abstraction;

public abstract class Ebook {
	
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void readBook();
	
	/**
	 * Default constructor
	 */
	public Ebook() {
		
	}
	
	/**
	 * Constructor with args
	 * @param title
	 */
	public Ebook(String title) {
		this.title = title;
	}
	
}
