public class Game extends Content{
	
	private boolean isMultiPlayer;
	private Os os;
	
	public Game(String iD, String applicationName, double price, boolean isMultiPlayer, Os os) {
		super(iD, applicationName, price);
		this.isMultiPlayer = isMultiPlayer;
		this.os = os;
	}


	public boolean isMultiPlayer() {
		return isMultiPlayer;
	}

	
	public void setMultiPlayer(boolean isMultiPlayer) {
		this.isMultiPlayer = isMultiPlayer;
	}

	
	public Os getOs() {
		return os;
	}

	
	public void setOs(Os os) {
		this.os = os;
	}

	
	@Override
	public String toString() {
		return "Game [isMultiPlayer=" + isMultiPlayer + ", os=" + os + "]";
	}
	
}
