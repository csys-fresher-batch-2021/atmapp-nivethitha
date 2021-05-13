package in.nivethitha.service;

import java.util.HashMap;


import in.nivethitha.model.User;
import in.nivethitha.util.*;

public class Login {
	/**
	 * This ArrayList is for adding user details
	 */
	public static HashMap<Long, Integer> masterCredentials = new HashMap<Long, Integer>();

	static {
		User user1 = new User();
		user1.accountNumber = 5976434678L;
		user1.pin = 1234;
		masterCredentials.put(user1.accountNumber, user1.pin);
		User user2 = new User();
		user2.accountNumber = 8767645334L;
		user2.pin = 8899;
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

	public static boolean isExist(Long accountNumber, int pin) {
		boolean exists = false;
//		
		NumberValidator.accountNumberValidation(accountNumber);
		NumberValidator.pinNumberValidation(pin);
		if (masterCredentials.containsKey((accountNumber))) {
			if (masterCredentials.get(accountNumber) == pin) {
				System.out.println("Proceed");
				exists = true;
			} else {
				System.out.println("invalid pin");
				exists = false;
			}
		} else {
			System.out.println("Account not found");
			exists = false;
		}
		return exists;

	}

}
