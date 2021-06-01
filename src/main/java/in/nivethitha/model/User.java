package in.nivethitha.model;

public class User {

	private String accountHolderName;
	private long accountNumber;
	private int pin;
	private double balance;
	private long mobileNo;

	public User(long accountNumber, int pin, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.pin = pin;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "User [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", pin=" + pin
				+ ", balance=" + balance + ", mobileNo=" + mobileNo + "]";
	}

}
