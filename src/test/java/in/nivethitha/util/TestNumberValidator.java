package in.nivethitha.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestNumberValidator {
	@Test
	public void withNegativeNumber() {
		try {
			long mobileNumber = -4567890321L;
			boolean exist = NumberValidator.isPositiveNumber(mobileNumber);
			assertFalse(exist);
		} catch (Exception e) {
			assertEquals("Mobile number should not be negative", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withPositiveNumber() {
		try {
			long mobileNumber = 4567890321L;
			boolean exist = NumberValidator.isPositiveNumber(mobileNumber);
			assertTrue(exist);
		} catch (Exception e) {
			assertEquals(true, e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withNullValue() {
		try {
			long mobileNumber = 8L;
			boolean exist = NumberValidator.isPositiveNumber(mobileNumber);
			assertTrue(exist);
		} catch (Exception e) {
			assertEquals("mobile number should not be empty", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withInvalidLength() {
		try {
			long mobileNumber = 23456L;

			boolean exist = NumberValidator.isValidLength(mobileNumber);
			assertFalse(exist);
		} catch (Exception e) {
			assertEquals("Please check your mobile number", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withValidLength() {
		try {
			long mobileNumber = 7543223456L;

			boolean exist = NumberValidator.isValidLength(mobileNumber);
			assertTrue(exist);
		} catch (Exception e) {
			assertEquals(true, e.getMessage());
			e.printStackTrace();
		}
		System.out.println("----------------------------------------------------------------------------------");
	}

	@Test
	public void withValidNumber() {
		try {
			long mobileNumber = 7543223456L;

			boolean exist = NumberValidator.isValidNumber(mobileNumber);
			assertFalse(exist);
		} catch (Exception e) {
			assertEquals(true, e.getMessage());
			e.printStackTrace();
		}
		System.out.println("valid number----------------------------------------------------------------------------------");
	}

	@Test
	public void withInValidNumber() {
		try {
			long mobileNumber = 6764875423456L;
			boolean exist = NumberValidator.isValidNumber(mobileNumber);
			assertFalse(exist);
		} catch (Exception e) {
			assertEquals("Please check your mobile number", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Invalid number----------------------------------------------------------------------------------");
	}
}
