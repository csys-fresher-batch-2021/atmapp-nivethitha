package in.nivethitha.util;

import in.nivethitha.exception.InvalidAccountHolderNameException;

public class StringValidator {
	private StringValidator() {

	}

	/**
	 * This method is for account holder name should not be empty or null
	 * @param accountHolderName
	 * @return
	 */

	public static boolean isValidString(String accountHolderName) throws InvalidAccountHolderNameException {
		if (accountHolderName == null || accountHolderName.trim().equals("")) {
			throw new InvalidAccountHolderNameException("Invalid accountHolderName");
		}
		return false;

	}
}
