package in.coNew;

import java.util.Scanner;
public class Practise {
	
	private String name;
	private int Account;
	private double balance;
	
	public Practise(String name, int Account, double balance) {
		this.name = name;
		this.Account = Account;
		this.balance = balance;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getaccount() {
		return Account;
	}
	public void setaccount(int Account) {
		this.Account = Account;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance = balance;
	}
	public void Car(int money1) {
		if(money1>1000000) {
			System.out.println("You can buy a car");
		}else {
			System.out.println("Pls Add a balance in your account ");
		}
	}
	public void Credit(int money) {
		balance+=money;
		System.out.println("Your account balance in now : "+balance);
	}
	public void CheckBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account no : ");
		int Ac = sc.nextInt();
		if(Ac==Account) {
			System.out.println("Now your balance is : "+balance);
		}else {
			System.out.println("Encorrect account No ");
		}
	}
	
	public static void main(String [] args) {
		Practise p = new Practise("Vishal Prajapat", 1234567, 100000000.00);
		System.out.println("Your name is : "+p.getname());
		System.out.println("Your acccount no is : "+p.getaccount());
		System.out.println("Your balance is : "+p.getbalance());
		
		p.Car(10000000);
		p.Credit(10000000);
		p.CheckBalance();
	}
	
}
