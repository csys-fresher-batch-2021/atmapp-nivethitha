package in.nivethitha.exception;

public class InvalidAccountNumberOrPinNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAccountNumberOrPinNumberException(String message) {
		super(message);
	}
}
