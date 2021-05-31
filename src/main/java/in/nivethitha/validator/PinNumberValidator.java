package in.nivethitha.validator;

public class PinNumberValidator {
	/**
	 * This method is for checking whether the number is positive or not    
	 * @param pin
	 * @return
	 */
	public static boolean isPositiveNumber(int pin) {
		boolean isValid = false;

		if (pin < 0) {
			isValid = false;
			throw new RuntimeException("Pin number should not be negative");

		}
		return isValid;
	}

	/**
	 * This method is for checking pin number length
	 * @param pin
	 * @return
	 */
	public static boolean isValidPinNumberFormat(int pin) {
		boolean isValid = false;
		String pinNumber = Long.toString(pin);
		String number = pinNumber.replaceAll("[^a-zA-Z0-9]", " ");
		if (number.length() != 4) {
			isValid = false;
			throw new RuntimeException("Invalid pin number");
		}
		return isValid;

	}

	/**
	 * This method is for checking whether the pin number is valid or not
	 * @param pin
	 * @return
	 */
	public static boolean isValidPinNumber(int pin) {
		boolean isValid = false;
		PinNumberValidator.isPositiveNumber(pin);
		PinNumberValidator.isValidPinNumberFormat(pin);
		return isValid;
	}
}
