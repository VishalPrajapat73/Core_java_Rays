package in.coTestInheritance;

public class Account extends Person {
	private String AccountType;
	private int AccountNo;
	private double balance;
	
	public Account(String name, int Age, String AccountType, int AccountNo, double balance) {
		super(name,Age);
		this.AccountType = AccountType;
		this.AccountNo = AccountNo;
		this.balance = balance;
	}
	
	public String getaccounttype() {
		return AccountType;
	}
	public int getaccountno() {
		return AccountNo;
	}
	public double getbalance() {
		return balance;
	}
	
}
