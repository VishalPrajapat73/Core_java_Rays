package in.coNew;

import java.sql.Date;
import java.time.LocalDate;
public class AccountMethod {
	
	
private static final Date Date = null;
// Use of Method //
//	private String number = null;
//	private String AccountType = null;
//	private double Balance = 0.000;
//	
//	
//	public String getNumber() {
//		return number;
//	}
//	public void setNumber(String number) {
//		this.number = number;
//	}
//	public String getAccountType() {
//		return AccountType;
//	}
//	public void setAccountType(String accountType) {
//		AccountType = accountType;
//	}
//	public double getBalance() {
//		return Balance;
//	}
//	public void setBalance(double balance) {
//		Balance = balance;
//	}
//	
//	public void Deposit(int a) {
//		a= (int)(Balance-a);
//		System.out.println("Deposit the balance is : "+a);
//	}
//	public void Withdraw(int a) {
//		System.out.println("Withdraw the balance is : "+a);
//	}
//	public void fundTransfer(int a) {
//		System.out.println("Transfer balance is : "+a);
//	}
//	public void payBill(int a) {
//		System.out.println("Your bill is pay rs : "+a);
//	}
//	
//	public static void main(String [] args) {
//		AccountMethod acc;
//		acc = new AccountMethod();
//		acc.setAccountType("Saving");
//		acc.setNumber("2002220212758");
//		acc.setBalance(1000000.000000);
//		
//		String a =  acc.getAccountType();
//		String b = acc.getNumber();
//		double d = acc.getBalance();
//		 System.out.println(a);
//		 System.out.println(b);
//		 System.out.println(d);
//		
//		acc.Deposit(10000);
//		acc.Withdraw(20000);
//		acc.fundTransfer(10000);
//		acc.payBill(1000);
//	}
	
	// Use of constructor and method //
	
	
	private String AccountType;
	private int AccountNo;
	private String name;
	private LocalDate dob;
	private int MobileNo;
	private String Address;
	private double balance;
	
	
	public AccountMethod(String AccountType, int AccountNo, String name, LocalDate dob, int MobileNo, String Address, double balance) {
		this.AccountType = AccountType;
		this.AccountNo = AccountNo;
		this.name = name;
		this.dob = dob;
		this.MobileNo = MobileNo;
		this.Address = Address;
		this.balance = balance;
	}

	public String getaccounttype() {
		return AccountType;
	}
	public void setaccounttype(String AccountType) {
		this.AccountType = AccountType;
	}
	public int getaccountno() {
		return AccountNo;
	}
	public void setaccountno(int AccountNo) {
		this.AccountNo = AccountNo;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public LocalDate getdate() {
		return dob;
	}
	public void setdate(LocalDate dob) {
		this.dob = dob;
	}
	public int getmobileno() {
		return MobileNo;
	}
	public void setmobileno(int MobileNo) {
		this.MobileNo = MobileNo;
	}
	public String getaddress() {
		return Address;
	}
	public void setaddress(String Address) {
		this.Address = Address;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public void Credit(int money) {
		System.out.println(money+" Will be Credited in your Account no :"+AccountNo);
		balance+=money;
		System.out.println("Now your current balance is : "+balance);
	}
	public void Debit(int money) {
		System.out.println(money+"Will be debited in your account no : "+AccountNo);
		balance-=money;
		System.out.println("Now your current balance is : "+balance);
	}
	
	public static void main(String [] args) {
		
		LocalDate dob = LocalDate.of(2004, 12, 21);
		
		AccountMethod acc = new AccountMethod("Saving" , 12345678, "Vishal Prajapat", dob, 917192426, "Indore India",10000000.00);
	
		System.out.println("Your Account Type is : "+acc.getaccounttype());
		System.out.println("Your Account No is : "+acc.getaccountno());
		System.out.println("Account Holder Name is : "+acc.getname());
		System.out.println("Account Holder Date of Birth is : "+acc.getdate());
		System.out.println("Account Holder Mobile no is : "+acc.getmobileno());
		System.out.println("Account Holder Address is : "+acc.getaddress());
		System.out.println("Account Holder Balance is : "+acc.getbalance());
		
		
		acc.Debit(10000);
		acc.Credit(1000000);
		
	}
	
	
	
	
	
	
}
