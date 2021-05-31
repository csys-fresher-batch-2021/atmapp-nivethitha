package in.nivethitha.util;

public class NumberValidator {
	/**
	 * This method is for mobile number should not be not null
	 * @param mobileNumber
	 * @return
	 */
	public static boolean isNotNull(long mobileNumber) {
		String number = Long.toString(mobileNumber);
		boolean isvalid = false;
		if (number != null) {

			isvalid = true;
		} else {
			throw new RuntimeException("mobile number should not be empty");
		}
		return isvalid;

	}

	/**
	 * This method is for mobile number should not contain negative values
	 * @param mobileNumber
	 * @return
	 */

	public static boolean isPositiveNumber(long mobileNumber) {
		boolean isvalid = false;
		if (mobileNumber > 0) {
			isvalid = true;
		} else {
			throw new RuntimeException("Mobile number should not be negative");

		}
		return isvalid;

	}

	/**
	 * This method is for checking mobile number length
	 * @param mobileNumber
	 * @return
	 */
	public static boolean isValidLength(long mobileNumber)

	{
		String number = Long.toString(mobileNumber);
		boolean isvalid = false;
		if (number.length() == 10) {
			isvalid = true;
		} else {
			isvalid = false;
			throw new RuntimeException("Invalid mobile number");
		}
		return isvalid;

	}

	/**
	 * This method is used to check whether the mobile number is valid or not
	 * @param mobileNumber
	 * @return
	 */

	public static boolean isValidNumber(long mobileNumber) {
		try {
			NumberValidator.isNotNull(mobileNumber);
			NumberValidator.isPositiveNumber(mobileNumber);
			NumberValidator.isValidLength(mobileNumber);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Please check your mobile number");
		}
		return false;

	}

}
