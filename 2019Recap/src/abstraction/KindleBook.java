package abstraction;

public class KindleBook extends Ebook{
	
	private boolean downloadedFromAmazon;
	
	public boolean isDownloadedFromAmazon() {
		return downloadedFromAmazon;
	}
	
	public void setDownloadedFromAmazon(boolean downloadedFromAmazon) {
		this.downloadedFromAmazon = downloadedFromAmazon;
	}
	
	@Override
	public void readBook() {
		if(this.downloadedFromAmazon) {
			System.out.println("Ok to read book.");
		} else {
			System.out.println("Not downloaded from amazon. Not OK to read book.");
		}
	}
	
	public KindleBook() {
		
	}
	
	public KindleBook(String title, boolean downloadedFromAmazon) {
		super(title);
		this.downloadedFromAmazon = downloadedFromAmazon;
	}
	
}
