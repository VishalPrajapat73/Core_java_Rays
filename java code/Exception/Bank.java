package in.co.Exception;

public class Bank {
	double balance;
	
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	
	public void deposit(double amount) {
		balance+=amount;
	}
	
	public double withdraw(double amount) throws BankException{
		if(balance<2000) {
			throw new BankException("Balance does not less than 2000 & it is a exception  ");
		}
		if(amount>balance) {
			throw new BankException("Insufficient balance" + "withdraw amount is more");
		}
		balance-=amount;
		return balance;
	}
	
	
}
