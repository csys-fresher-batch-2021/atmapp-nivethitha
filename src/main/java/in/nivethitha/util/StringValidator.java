package in.nivethitha.util;

public class StringValidator {
	/**
	 * This method is for account holder name should not be empty or null
	 * @param accountHolderName
	 * @return
	 */
	
public static boolean isValidString(String accountHolderName)
{
	boolean isvalid=false;
	if(accountHolderName==null||accountHolderName.trim().equals("")) {
		isvalid=false;
		throw new RuntimeException("Invalid accountHolderName");
	}
	else {
		isvalid=true;
	}
	return isvalid;
	
	
}
}
