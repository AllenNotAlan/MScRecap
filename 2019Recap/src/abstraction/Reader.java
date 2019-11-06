package abstraction;

public class Reader {
	
	public static void main(String[] args) {
		
		Ebook book1 = new KindleBook("Harry Potter", true);
		book1.readBook();
		
		Ebook book2 = new NexusBook();
		book2.readBook();
		
		KindleBook book3 = new KindleBook();
		book3.setDownloadedFromAmazon(true);
		
		book3.readBook();
		
	}
}
