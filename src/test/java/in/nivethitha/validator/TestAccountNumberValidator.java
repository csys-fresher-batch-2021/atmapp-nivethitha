package in.nivethitha.validator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestAccountNumberValidator {
	@Test
	public void numberWithInvalidLength() {
		try {
			long accountNumber = 98564321789L;
			boolean isexist = AccountNumberValidator.isValidAccountNumber(accountNumber);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals("Invalid account number format", e.getMessage());
			e.printStackTrace();

		}

		System.out.println("---------------------------------------");
	}

	@Test
	public void numberWithNegativeValue() {
		try {
			long accountNumber = -9856432178L;
			boolean isexist = AccountNumberValidator.isValidAccountNumber(accountNumber);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals("Account number should not be negative", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");

	}

	@Test
	public void withEmptyField() {
		try {
			long accountNumber = 0L;
			boolean isexist = AccountNumberValidator.isValidAccountNumber(accountNumber);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals("Invalid account number format", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");
	}

	@Test
	public void withValidAccountNumber() {
		try {
			long accountNumber = 8276459025L;
			boolean isexist = AccountNumberValidator.isValidAccountNumber(accountNumber);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals(true, e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");

	}

}
