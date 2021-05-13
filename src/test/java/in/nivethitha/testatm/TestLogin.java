package in.nivethitha.testatm;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.nivethitha.service.Login;
import in.nivethitha.validator.NumberValidator;

public class TestLogin {
	@Test
	public void withInvalidAccountNumber() {
		Long accountNumber = 37519076673L;
		int pin = 1234;
		boolean exist = Login.isExist(accountNumber, pin);
		assertFalse(exist);
		System.out.println("Invalid account number");
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withInvalidpinNumber() {
		Long accountNumber = 3751907667L;
		int pin = 876;
		boolean exist = Login.isExist(accountNumber, pin);
		assertFalse(exist);
		System.out.println("Invalid pin number");
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withValidpinAndAccountNumber() {
		Long accountNumber = 3751907667L;
		int pin = 8768;
		boolean exist = Login.isExist(accountNumber, pin);
		assertTrue(exist);
		System.out.println("Welcome");
		System.out.println("----------------------------------------------------------------------------------");
	}

}
