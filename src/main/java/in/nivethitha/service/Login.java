package in.nivethitha.service;

import java.util.List;
import in.nivethitha.dao.UserDataDAO;
import in.nivethitha.exception.InvalidAccountNumberFormatException;
import in.nivethitha.exception.InvalidAccountNumberOrPinNumberException;
import in.nivethitha.exception.InvalidPinNumberFormatException;
import in.nivethitha.exception.NegativeAccountNumberException;
import in.nivethitha.exception.NegativePinNumberException;
import in.nivethitha.model.User;
import in.nivethitha.validator.AccountNumberValidator;
import in.nivethitha.validator.PinNumberValidator;

public class Login {
	private Login() {
		// Default Constructor
	}

	/**
	 * This ArrayList is for adding user details
	 * @throws InvalidAccountNumberFormatException
	 * @throws NegativeAccountNumberException
	 * @throws InvalidPinNumberFormatException
	 * @throws NegativePinNumberException
	 */
	public static String loginValidation(long accountNumber, int pin)
			throws InvalidAccountNumberOrPinNumberException, NegativeAccountNumberException,
			InvalidAccountNumberFormatException, NegativePinNumberException, InvalidPinNumberFormatException {
		AccountNumberValidator.isValidAccountNumber(accountNumber);
		PinNumberValidator.isValidPinNumber(pin);
		String userName = "";
		UserDataDAO userDataDAO = new UserDataDAO();
		List<User> masterCredentials = userDataDAO.loginCredentialData();
		for (User user : masterCredentials) {
			if (accountNumber == user.getAccountNumber() && user.getPin() == (pin)) {
				userName = user.getAccountHolderName();
				accountNumber = user.getAccountNumber();
				break;

			} else {
				throw new InvalidAccountNumberOrPinNumberException("Invalid credentials");
			}
		}
		System.out.println("Welcome  " + userName);
		return userName;

	}
}