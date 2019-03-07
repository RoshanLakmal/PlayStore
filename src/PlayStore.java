import java.util.ArrayList;

public class PlayStore {
	
	private ArrayList<Content> contents;
	private ArrayList<User> users;
	
	public PlayStore() {
		contents = new ArrayList<Content>();
		users = new ArrayList<User>();
	}
	
	
	public void add(String id, Content content) {
		// add the content into your content list
		contents.add(content);
	}
	
	
	public void add(User user) {
		// add the user to your list of users
		users.add(user);
	}
	
	
	public void showReadingOfGenre(String genre) {
		for( int i = 0; i < contents.size(); i++ ){
			if(contents.get(i) instanceof Reading){
				String listGenre = ((Reading)this.contents.get(i)).getGenre();
				if(listGenre.equals(genre)){
					System.out.println("Genre found " + this.contents.get(i).getId() + " - " + listGenre);
					return;
				}else {
					System.out.println("Genre not found");
				}	
			}
		}
	}
	
	//showContent method to display the contents. 
	public void showContent() {
		// add your code here
		System.out.println("Games");
		showUniqueContent("Game");
		
		System.out.println("Book");
		showUniqueContent("Book");
		
		System.out.println("Magazine");
		showUniqueContent("Magazine");
	}
	
	//ShowUniqueContent from the content list.
	private void showUniqueContent(String type){
		for( int i = 0; i < contents.size(); i++){
			if(contents.get(i).getClass().getName().equals(type)){
				System.out.println(this.contents.get(i).getId() + " - " + this.contents.get(i).getApplicationName());
			}
		}
	}
	
}