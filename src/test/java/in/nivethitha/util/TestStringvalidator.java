package in.nivethitha.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestStringvalidator {
@Test
public void withValidName()
{
	String accountHolderName="Raja";
	boolean isvalid=StringValidator.isValidString(accountHolderName);
	assertEquals(true,isvalid);
System.out.println("---------------------------------------------------");
}
@Test
public void withInValidName()
{
	try {
		String accountHolderName="";
		boolean isvalid=StringValidator.isValidString(accountHolderName);
		assertTrue(isvalid);
	} catch (Exception e) {
		assertEquals("Invalid accountHolderName",e.getMessage());
		e.printStackTrace();
	}
	System.out.println("---------------------------------------------------");

}
@Test
public void lettersWithSpace()
{
	try {
		String accountHolderName="    Ra";
		boolean isvalid=StringValidator.isValidString(accountHolderName);
		assertTrue(isvalid);
	} catch (Exception e) {
		assertEquals("Invalid accountHolderName",e.getMessage());
		e.printStackTrace();
	}
	System.out.println("---------------------------------------------------");

}

}
