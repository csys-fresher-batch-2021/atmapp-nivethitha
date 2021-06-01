package in.nivethitha.exception;

public class NegativeAccountNumberException extends Exception {
	private static final long serialVersionUID = 1L;

	public NegativeAccountNumberException(String message) {
		super(message);
	}
}
