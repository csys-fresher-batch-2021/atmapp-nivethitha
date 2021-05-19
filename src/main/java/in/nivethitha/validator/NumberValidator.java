package in.nivethitha.validator;

/**
 * @author nive2676
 *
 */
public class NumberValidator {
	/**
	 * This method is for validating account Number
	 * 
	 * @param accountNumber
	 * @return
	 * @throws Exception
	 */
	public static boolean accountNumberValidation(String accountNumber) {

		if (accountNumber.length() != 10) {

			throw new RuntimeException("Please check your Account number");

		}

		return true;
	}

	/**
	 * This method is for validating pin Number
	 * 
	 * @param pin
	 * @return
	 * @throws Exception
	 */
	public static boolean pinNumberValidation(String pin) {

		if (pin.length() != 4) {

			throw new RuntimeException("Please check your pin number");

		}

		return true;

	}

}
