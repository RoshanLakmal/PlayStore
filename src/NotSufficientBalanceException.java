public class NotSufficientBalanceException extends Exception{
	
	private String message;
	
	public NotSufficientBalanceException(String message) {
		super(message);
	}

}
