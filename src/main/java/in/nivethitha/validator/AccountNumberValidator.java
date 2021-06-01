package in.nivethitha.validator;

import in.nivethitha.exception.InvalidAccountNumberFormatException;
import in.nivethitha.exception.NegativeAccountNumberException;

public class AccountNumberValidator {
	private AccountNumberValidator() {

	}

	/**
	 * This method is for checking whether the account is exist or not
	 * 
	 * @param accountNumber
	 * @return
	 */
	public static boolean isPositiveAccountNumber(long accountNumber) throws NegativeAccountNumberException {

		if (accountNumber < 0) {
			throw new NegativeAccountNumberException("Account number should not be negative");

		}
		return false;
	}

	/**
	 * 
	 * @param accountNumber
	 * @return
	 */
	public static boolean isValidAccountNumberFormat(long accountNumber) throws InvalidAccountNumberFormatException {
		String account = Long.toString(accountNumber);
		String number = account.replaceAll("[^a-zA-Z0-9]", " ");
		if (number.length() != 10) {
			throw new InvalidAccountNumberFormatException("Invalid account number format");
		}
		return false;

	}

	public static boolean isValidAccountNumber(long accountNumber)
			throws NegativeAccountNumberException, InvalidAccountNumberFormatException {
		boolean isValid = false;
		AccountNumberValidator.isPositiveAccountNumber(accountNumber);
		AccountNumberValidator.isValidAccountNumberFormat(accountNumber);
		return isValid;
	}

}
