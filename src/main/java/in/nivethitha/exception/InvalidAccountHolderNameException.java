package in.nivethitha.exception;

public class InvalidAccountHolderNameException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAccountHolderNameException(String message) {
		super(message);
	}
}
