package in.nivethitha.util;

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
	public static boolean accountNumberValidation(long accountNumber) {
		String number = String.valueOf(accountNumber);

		if (number.length() != 10) {
			do {
				System.out.println("Invalid account number");
			} while (number.length() == 10);
		}

		return false;
	}

	/**
	 * This method is for validating pin Number
	 * 
	 * @param pin
	 * @return
	 * @throws Exception
	 */
	public static boolean pinNumberValidation(int pin) {
		String pinNumber = String.valueOf(pin);

		if (pinNumber.length() != 4) {
			do {

				System.out.println("Invalid pin number");

			} while (pinNumber.length() == 4);
		}

		return false;

	}

}
