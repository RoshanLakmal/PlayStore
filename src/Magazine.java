public class Magazine extends Reading{
	
	private String title;
	
	public Magazine(String iD, String applicationName, double price, String publisher, String genre, int numOfPages, String title) {
		super(iD, applicationName, price, publisher, genre, numOfPages);
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}
	
}
