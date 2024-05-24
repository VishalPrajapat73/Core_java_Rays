package in.co.Exception;

public class BankException extends Exception {
	public BankException (String msg) {
		super(msg);
	}
	
	
	public static void main (String [] args){
		Bank b = new Bank();
		b.setbalance(3000);
		b.deposit(500);
		try {
			b.withdraw(2000);
			System.out.println(b.getbalance());
		}catch(BankException e) {
			System.out.println(e.getMessage());
		}
	}
}
