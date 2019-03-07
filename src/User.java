import java.util.ArrayList;

public class User {
	
	private String id;
	private String name;
	private String phoneNum;
	private double balance;
	private Os os;
	private boolean isPremium;
	private ArrayList<Content> myContents;
	
	public User(String id, String name, String phoneNum, double balance, Os os) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.balance = balance;
		this.os = os;
		this.isPremium = false;
		myContents = new ArrayList<Content>();
	}

	
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getPhoneNum() {
		return phoneNum;
	}

	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public Os getOs() {
		return os;
	}

	
	public void setOs(Os os) {
		this.os = os;
	}

	
	public boolean isPremium() {
		return isPremium;
	}
	
	
	public ArrayList<Content> getMyContents() {
		return myContents;
	}

	//becomePremium method to upgrade a user to a premium user. 
	public void becomePremium() {
		if(isPremium){
			System.out.println("You are already a premium member!");
		}else if(balance >= 100 && !isPremium){
			balance -= 100;
			this.isPremium = true;
			System.out.println("Congradulations you are a premium member in PlayStore!");
		}else{
			System.out.println("Balance is not sufficent. You need at least 100$ in your account.");
		}
	}

	
	//buy content method to buy different contents. 
	public void buyContent(Content content){
		String id = content.getId();
		double contentPrice = content.getPrice();
		int numOfDownloads = content.getNumOfDownloads();
		
		if(content instanceof Game){
			
			String os = ((Game) content).getOs().getOs();
			int version = ((Game) content).getOs().getVersion();
			
			try {
				this.checkCompatiability(os,version);
			} catch (IncompatibilityException e) {
				System.err.println(e.getMessage());
				return;
			}
		}
		
		if(isPremium){
			
			double discount = (contentPrice * 20)/100;
			double discountPrice = contentPrice - discount;
			
			try {
				this.validPurchase(discountPrice,content);
			} catch (NotSufficientBalanceException e) {
				System.err.println(e.getMessage());
			}
			
		}else{
			try {
				this.validPurchase(contentPrice,content);
			} catch (NotSufficientBalanceException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	private void validPurchase(double contentPrice, Content content) throws NotSufficientBalanceException{
		int numOfDownloads = content.getNumOfDownloads();
		if(this.balance < contentPrice){
			throw new NotSufficientBalanceException("Not enough money to buy the item " + content.getId());
		}else{
			this.balance -= contentPrice;
			numOfDownloads++;
			content.setNumOfDownloads(numOfDownloads);
			System.out.println("You have successfully bought item " + content.getId());
		}
	}
	
	private void checkCompatiability(String os, int version) throws IncompatibilityException{
		if(!(this.os.getOs().equals(os))){
			throw new IncompatibilityException("The operating systems are not the same");
		}else if(this.os.getVersion() < version){
			throw new IncompatibilityException("The operating systems version is less than the minimum required version number of the game");
		}
	}
	
	
	public void showContentBought(){
		for(int i = 0;i < myContents.size();i++){
			System.out.println(this.id+ " - " +myContents.get(i).getId() + " - " + myContents.get(i).getApplicationName());
		}
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNum=" + phoneNum + ", balance=" + balance + ", os=" + os
				+ "]";
	}

}
