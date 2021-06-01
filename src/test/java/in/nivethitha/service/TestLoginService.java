package in.nivethitha.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLoginService {
	@Test
	public void withValidAccountNumberPinNumber() {
		long accountNumber = 8276459025L;
		int pin = 1234;
		String result = Login.loginValidation(accountNumber, pin);
		assertEquals("Krishna", result);
		System.out.println("------------------------------------------------------");
	}

	@Test
	public void withInvalidLengthAccountNumber() {
		try {
			long accountNumber = 456783902903L;
			int pin = 1234;
			String result = Login.loginValidation(accountNumber, pin);
			assertEquals("Invalid account number format", result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withIncorrectPinNumber() {
		try {
			long accountNumber = 8276459025L;
			int pin = 1239;
			String result = Login.loginValidation(accountNumber, pin);
			assertEquals("Incorrect account number or Pin number", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withIncorrectAccountNumber() {
		try {
			long accountNumber = 9076459025L;
			int pin = 1239;
			String result = Login.loginValidation(accountNumber, pin);
			assertEquals("Incorrect account number or Pin number", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withEmptyAccountNumber() {
		try {
			long accountNumber = 0L;
			int pin = 1239;
			String result = Login.loginValidation(accountNumber, pin);
			assertEquals("Invalid account number format", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withEmptyPinNumber() {
		try {
			long accountNumber = 8276459025L;
			int pin = 0;
			String result = Login.loginValidation(accountNumber, pin);
			assertEquals("Invalid pin number", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withEmptyAccountAndPinNumber() {
		try {
			long accountNumber = 0L;
			int pin = 0;
			String result = Login.loginValidation(accountNumber, pin);
			assertEquals("Invalid account number format", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}
}
