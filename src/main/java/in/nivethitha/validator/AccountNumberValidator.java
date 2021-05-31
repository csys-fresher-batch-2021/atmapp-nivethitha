package in.nivethitha.validator;


public class AccountNumberValidator {
	/**
	 * This method is for checking whether the account is exist or not
	 * @param accountNumber
	 * @return
	 */
	public static boolean isPositiveAccountNumber(long accountNumber) {
		boolean isValid = false;

		if (accountNumber < 0) {
			isValid = false;
			throw new RuntimeException("Account number should not be negative");

		}
		return isValid;
	}
	/**
	 * 
	 * @param accountNumber
	 * @return
	 */
	public static boolean isValidAccountNumberFormat(long accountNumber) {
		boolean isValid = false;
		String account = Long.toString(accountNumber);
         String number=account.replaceAll("[^a-zA-Z0-9]"," ");
         if (number.length() != 10) {
 			isValid = false;
 			throw new RuntimeException("Invalid account number format");
 		}
		return isValid;
		
	}
	public static boolean isValidAccountNumber(long accountNumber) {
		boolean isValid = false;
			AccountNumberValidator.isPositiveAccountNumber(accountNumber);
			AccountNumberValidator.isValidAccountNumberFormat(accountNumber);
		return isValid;
		}
	
	

}
