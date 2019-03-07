import java.util.ArrayList;

public class Comment {
	
	private User user;
	private String comment;
	private ArrayList<Comment> replyOfComment;
	
	public Comment(User user, String comment) {
		super();
		this.user = user;
		this.comment = comment;
		this.replyOfComment = new ArrayList<Comment>();
	}

	
	public User getUser() {
		return user;
	}

	
	public void setUser(User user) {
		this.user = user;
	}

	
	public String getComment() {
		return comment;
	}

	
	public void setComment(String comment) {
		this.comment = comment;
	}

	
	public ArrayList<Comment> getReplyOfComment() {
		return replyOfComment;
	}

	
	public void setReplyOfComment(ArrayList<Comment> replyOfComment) {
		this.replyOfComment = replyOfComment;
	}

	
	public void addReply(Comment comment){
		this.replyOfComment.add(comment);
	}
	
	//print the format of the comment.
	public void printFormatComment(){
		System.out.println(this.user.getName() + " ( " + this.user.getId() + " ) : " + this.comment);
	}
	
	
	//Overload printReplyOfComments method with no overload aruguments. This will recursively print replies for the comment. 
	public void printReplyOfComments(){
		int commentRepSize = this.replyOfComment.size();
		if(commentRepSize > 0){
			int space = 1;
			for(int i = 0; i < commentRepSize;i++){
				for(int j = 0; j < space;j++){
					System.out.print("\t");
				}
				Comment reply = this.replyOfComment.get(i);
				reply.printFormatComment();
				reply.printReplyOfComments(space + 1);
			}
		}
	}
	
	
	//Overload printReplyOfComments method with space arugument. 
	public void printReplyOfComments(int space){
		
		int commentRepSize = this.replyOfComment.size();
		
		if(commentRepSize > 0){
			for(int i = 0; i < commentRepSize;i++){
				for(int j = 0; j < space;j++){
					System.out.print("\t");
				}
				Comment reply = this.replyOfComment.get(i);
				reply.printFormatComment();
				reply.printReplyOfComments(space + 1);
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Comment [user=" + user + ", comment=" + comment + "]";
	}
	
}
