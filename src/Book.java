import java.util.Arrays;

public class Book extends Reading{

	private String[] authors;

	public Book(String iD, String applicationName, double price, String publisher, String genre, int numOfPages, String[] authors) {
		super(iD, applicationName, price, publisher, genre, numOfPages);
		this.authors = authors;
	}


	public String[] getAuthors() {
		return authors;
	}

	
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	
	@Override
	public String toString() {
		return "Book [authors1=" + Arrays.toString(authors) + "]";
	}
	
}
