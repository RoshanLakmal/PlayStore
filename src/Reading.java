public abstract class Reading extends Content{

	private String publisher;
	private String genre;
	private int numOfPages;

	
	public Reading(String iD, String applicationName, double price, String publisher, String genre, int numOfPages) {
		super(iD, applicationName, price);
		this.publisher = publisher;
		this.genre = genre;
		this.numOfPages = numOfPages;
	}

	
	public String getPublisher() {
		return publisher;
	}

	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	public String getGenre() {
		return genre;
	}

	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	public int getNumOfPages() {
		return numOfPages;
	}

	
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	
	@Override
	public String toString() {
		return "Reading [publisher=" + publisher + ", genre=" + genre + ", numOfPages=" + numOfPages + "]";
	}

	
}
