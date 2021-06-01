package in.nivethitha.exception;

public class InvalidAccountNumberFormatException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAccountNumberFormatException(String message) {
		super(message);
	}
}
