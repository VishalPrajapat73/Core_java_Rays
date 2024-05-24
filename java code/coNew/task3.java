package in.coNew;

import java.time.LocalDate;
import java.time.Period;
public class task3 {
     
	
//	Account task //
	
	
//	private int number;
//	private String account;
//	private double balance;
//	
//	public task3(int number, String account, double balance) {
//		this.number = number;
//		this.account = account;
//		this.balance = balance;
//	}
//	
//	public int getNumber() {
//		return number;
//	}
//	public String getAccount() {
//		return account;
//	}
//	public double getbalance() {
//		return balance;
//	}
//	public void deposit(double amount) {
//		if(amount>0) {
//			balance+=amount;
//			System.out.println("Withdrawal Succeful , New Balance is : "+balance);
//		}else {
//			System.out.println("Invalid Withdrawal amount ");
//		}
//	}
//	
//	public void withdraw(double amount) {
//		if(amount>0&&amount<=balance) {
//			balance-=amount;
//			System.out.println("Deposit succeful balance is : "+balance);
//		}
//	}
//	public static void main(String[] args) {
//		task3 ac = new task3(1234567, "Saving", 10000.0);
//		System.out.println("Account no : "+ac.getNumber());
//		System.out.println("Account type : "+ac.account);
//		System.out.println("Balance : "+ac.getbalance());
//		
//		
//	ac.withdraw(200.0);
//	ac.deposit(100000);
	
	// Date of birth and name //    
	
	private String name;
	private LocalDate dob;
	private String address;
	
	public task3(String name, LocalDate dob, String address) {
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void SetName() {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(dob, currentDate).getYears();
	}

	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2004,12,21);
		task3 task = new task3("Vishal ", dob, "Indore");
		
		
		System.out.println("Name : "+task.getName());
		System.out.println("Date of Birth : "+task.getDob());
		System.out.println("Address : "+task.getAddress());
		System.out.println("Age : "+task.getAge());
	}
	
	
	
}







