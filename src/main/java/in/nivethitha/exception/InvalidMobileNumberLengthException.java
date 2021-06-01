package in.nivethitha.exception;

public class InvalidMobileNumberLengthException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidMobileNumberLengthException(String message) {
		super(message);
	}
}
