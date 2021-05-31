package in.nivethitha.testatm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.nivethitha.service.Login;

public class TestLogin {
	@Test
	public void withValidAccountNumberPinNumber() {
		boolean exist;
		try {
			String accountNumber = "5976434678";
			String pin = "1234";
			exist = Login.isExist(accountNumber, pin);
			assertTrue(exist);
		} catch (Exception e) {
			assertEquals("Welcome to ATM Services", e.getMessage());
			e.printStackTrace();
		}

		System.out.println("valid");
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withIncorrectAccountNumber() {
		try {
			String accountNumber = "6783902492";
			String pin = "1234";
			boolean exist = Login.isExist(accountNumber, pin);
			assertFalse(exist);
			System.out.println("Empty Account Number");
		} catch (Exception e) {
			assertEquals("Account not found", e.getMessage());
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withIncorrectPinNumber() {
		try {
			String accountNumber = "5976434678";
			String pin = "4567";
			boolean exist = Login.isExist(accountNumber, pin);
			assertTrue(exist);
		} catch (Exception e) {
			assertEquals("Incorrect pin", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withEmptypinAndEmptyAccountNumber() {
		try {
			String accountNumber = "";
			String pin = "";
			boolean exist = Login.isExist(accountNumber, pin);
			assertTrue(exist);
			System.out.println("empty pin and account");
		} catch (Exception e) {
			assertEquals("Please check your Account number", e.getMessage());

			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

}
