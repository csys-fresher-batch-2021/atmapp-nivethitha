package in.nivethitha.validator;

import in.nivethitha.exception.InvalidPinNumberFormatException;
import in.nivethitha.exception.NegativePinNumberException;

public class PinNumberValidator {
	private PinNumberValidator() {
		// Default constructor
	}
	/**
	 * This method is for checking whether the number is positive or not    
	 * @param pin
	 * @return
	 */
	public static boolean isPositiveNumber(int pin)throws NegativePinNumberException {

		if (pin < 0) {
			throw new NegativePinNumberException("Pin number should not be negative");

		}
		return false;
	}

	/**
	 * This method is for checking pin number length
	 * @param pin
	 * @return
	 */
	public static boolean isValidPinNumberFormat(int pin)throws InvalidPinNumberFormatException {
		String pinNumber = Long.toString(pin);
		String number = pinNumber.replaceAll("[^a-zA-Z0-9]", " ");
		if (number.length() != 4) {
			throw new InvalidPinNumberFormatException("Invalid pin number");
		}
		return false;

	}

	/**
	 * This method is for checking whether the pin number is valid or not
	 * @param pin
	 * @return
	 * @throws NegativePinNumberException 
	 * @throws InvalidPinNumberFormatException 
	 */
	public static boolean isValidPinNumber(int pin) throws NegativePinNumberException, InvalidPinNumberFormatException {
		boolean isValid = false;
		PinNumberValidator.isPositiveNumber(pin);
		PinNumberValidator.isValidPinNumberFormat(pin);
		return isValid;
	}
}
