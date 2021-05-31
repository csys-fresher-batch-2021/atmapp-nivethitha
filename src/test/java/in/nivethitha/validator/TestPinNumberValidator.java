package in.nivethitha.validator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestPinNumberValidator {
	@Test
	public void withInvalidlength() {
		try {
			int pin = 12345;
			boolean isexist = PinNumberValidator.isValidPinNumber(pin);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals("Invalid pin number", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");

	}

	@Test
	public void withNegativeValue() {
		try {
			int pin = -1234;
			boolean isexist = PinNumberValidator.isValidPinNumber(pin);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals("Pin number should not be negative", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");

	}

	@Test
	public void withEmptyField() {
		try {
			int pin = 0;
			boolean isexist = PinNumberValidator.isValidPinNumber(pin);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals("Invalid pin number", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");

	}

	@Test
	public void withValidPin() {
		try {
			int pin = 1234;
			boolean isexist = PinNumberValidator.isValidPinNumber(pin);
			assertFalse(isexist);
		} catch (Exception e) {
			assertEquals(true, e.getMessage());
			e.printStackTrace();
		}
		System.out.println("--------------------------------------");

	}
}
