package in.nivethitha.validator;

public class NumberValidator {
	public static boolean accountNumberValidation(String accountNumber)
	{
		String number=String.valueOf(accountNumber);
		
			if (number.length() != 10) {
				do {
					System.out.println("Invalid Account Number");
				} while (number.length() == 10);
			}
			return false;
	

		}
	public static boolean pinNumberValidation(String pinNumber)
	{
		String pin=String.valueOf(pinNumber);
		if (pinNumber.length() != 4) {
			do {
				System.out.println("Invalid Pin Number");
			} while (pinNumber.length() == 4);
		}
		return false;
		
	}

}
