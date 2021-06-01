package in.nivethitha.exception;

public class InvalidPinNumberFormatException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidPinNumberFormatException(String message) {
		super(message);
	}
}
