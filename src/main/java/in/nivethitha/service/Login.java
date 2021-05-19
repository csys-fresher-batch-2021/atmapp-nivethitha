package in.nivethitha.service;

import java.util.HashMap;

import in.nivethitha.model.User;
//import in.nivethitha.util.StringValidator;
//import in.nivethitha.util.StringValidator;
//import in.nivethitha.util.StringValidator;
import in.nivethitha.validator.NumberValidator;

public class Login {
	/**
	 * This ArrayList is for adding user details
	 */
	public static HashMap<String, String> masterCredentials = new HashMap<String, String>();

	static {
		User user1 = new User();
		user1.accountNumber = "5976434678";
		user1.pin = "1234";
		masterCredentials.put(user1.accountNumber, user1.pin);
		User user2 = new User();
		user2.accountNumber = "8767645334";
		user2.pin = "8899";
		user2.balance = 4000;
		masterCredentials.put(user2.accountNumber, user2.pin);

	}

	/**
	 * This method is for checking whether the AccountNumber and Pin Number is exist
	 * or not
	 * 
	 * @param accountnumber
	 * @param pin
	 * @throws Exception
	 */

	public static boolean isExist(String accountNumber, String pin) {
		boolean exists = false;
		NumberValidator.accountNumberValidation(accountNumber);
		NumberValidator.pinNumberValidation(pin);
		//StringValidator.isValidNumber(accountNumber);
		//StringValidator.isValidPin(pin);
		if (masterCredentials.containsKey((accountNumber))) {
			if (masterCredentials.get(accountNumber).equals(pin)) {

				exists = true;
			} else {
				throw new RuntimeException("Incorrect pin");

			}
		} else {
			throw new RuntimeException("Account not found");
		}

		return exists;
	}
}
