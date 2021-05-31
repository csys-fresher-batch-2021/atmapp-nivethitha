package in.nivethitha.service;

import java.util.List;
import in.nivethitha.dao.UserDataDAO;
import in.nivethitha.model.User;
import in.nivethitha.validator.AccountNumberValidator;
import in.nivethitha.validator.PinNumberValidator;

public class Login {
	/**
	 * This ArrayList is for adding user details
	 */
	public static String loginValidation(long accountNumber, int pin) {
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
				throw new RuntimeException("Incorrect account number or Pin number");
			}
		}
		System.out.println("Welcome  " + userName);
		return userName;

	}
}