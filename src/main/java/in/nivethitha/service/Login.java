package in.nivethitha.service;
public class Login {
	/**
	 * This method is for  AccountNumber and Pin Number
	 * @param accountnumber
	 * @param pin
	 */
	public static boolean isExist(String accountNumber, String pin) {
		boolean exists=false;
		if(accountNumber.length()==10&&pin.length()==4)
		{
			exists=true;
		}
		else
		{
			exists=false;
		}
		return exists;
			
	}

}
