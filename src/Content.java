import java.util.ArrayList;

public abstract class Content {
	
	private String id;
	private String applicationName;
	private int numOfDownloads;
	private double price;
	private ArrayList<Comment> reviews;
	
	public Content(String id, String applicationName, int numOfDownloads, double price, ArrayList<Comment> reviews) {
		this.id = id;
		this.applicationName = applicationName;
		this.numOfDownloads = numOfDownloads;
		this.price = price;
		this.reviews = reviews;
	}
	
	
	public Content(String iD, String applicationName, double price) {
		this.id = iD;
		this.applicationName = applicationName;
		this.price = price;
		this.reviews = new ArrayList<Comment>();
	}


	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getApplicationName() {
		return applicationName;
	}
	
	
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	
	public int getNumOfDownloads() {
		return numOfDownloads;
	}
	
	
	public void setNumOfDownloads(int numOfDownloads) {
		this.numOfDownloads = numOfDownloads;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public ArrayList<Comment> getComments() {
		return reviews;
	}
	
	
	public void setComments(ArrayList<Comment> reviews) {
		this.reviews = reviews;
	}

	
	public void addReview(Comment comment){
		reviews.add(comment);
	}
	
	//showReviews method to display the reviews of the content. 
	public void showReviews(){
		for(int i = 0;i < reviews.size();i++){
			Comment comment = this.reviews.get(i);
			this.showReview(comment);
		}
	}
	
	
	//calling the printFormat method and the printReplyOfComments method. 
	private void showReview(Comment comment){
		comment.printFormatComment();
		comment.printReplyOfComments();
	}
	
	
	@Override
	public String toString() {
		return "Content [id=" + id + ", applicationName=" + applicationName + ", numOfDownloads=" + numOfDownloads
				+ ", price=" + price + ", comments=" + reviews + "]";
	}
	
		
}
