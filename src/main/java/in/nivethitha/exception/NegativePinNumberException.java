package in.nivethitha.exception;

public class NegativePinNumberException extends Exception {
	private static final long serialVersionUID = 1L;

	public NegativePinNumberException(String message) {
		super(message);
	}
}
