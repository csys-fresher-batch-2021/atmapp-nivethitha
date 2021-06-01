package in.nivethitha.util;

import in.nivethitha.exception.EmptyMobileNumberException;
import in.nivethitha.exception.InvalidMobileNumberException;
import in.nivethitha.exception.InvalidMobileNumberLengthException;
import in.nivethitha.exception.NegativeMobileNumberException;

public class NumberValidator {
	private NumberValidator() {
		//Default Constructor
	}
	/**
	 * This method is for mobile number should not be not null
	 * @param mobileNumber
	 * @return
	 */
	public static boolean isNotNull(long mobileNumber)throws EmptyMobileNumberException {
		String number = Long.toString(mobileNumber);
		if (number == null) {
			throw new EmptyMobileNumberException("mobile number should not be empty");

		}
		return false; 
		}
		

	

	/**
	 * This method is for mobile number should not contain negative values
	 * @param mobileNumber
	 * @return
	 */

	public static boolean isPositiveNumber(long mobileNumber)throws NegativeMobileNumberException {
		
		if (mobileNumber > 0) {
		
			throw new NegativeMobileNumberException("Mobile number should not be negative");

		}
		return false; 

		}
		

	

	/**
	 * This method is for checking mobile number length
	 * @param mobileNumber
	 * @return
	 */
	public static boolean isValidLength(long mobileNumber)throws InvalidMobileNumberLengthException

	{
		String number = Long.toString(mobileNumber);
		if (number.length() != 10) {
			throw new InvalidMobileNumberLengthException("Invalid mobile number");

		}
		return false; 
		}
		

	

	/**
	 * This method is used to check whether the mobile number is valid or not
	 * @param mobileNumber
	 * @return
	 */

	public static boolean isValidNumber(long mobileNumber)throws InvalidMobileNumberException {
		try {
			NumberValidator.isNotNull(mobileNumber);
			NumberValidator.isPositiveNumber(mobileNumber);
			NumberValidator.isValidLength(mobileNumber);
		} catch (Exception e) {
			e.printStackTrace();
			throw new InvalidMobileNumberException("Please check your mobile number");
		}
		return false;

	}

}
