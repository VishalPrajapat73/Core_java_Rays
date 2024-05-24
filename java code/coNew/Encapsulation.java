package in.coNew;

public class Encapsulation {
		
	private String name = null;
	private int Money = 0;
	private String Address = null;
	
	public String getname() {
		return name;
	}
	public void setname(String Name) {
		this.name = Name;
	}
	public int getmoney() {
		return Money;
	}
	public void setmoney(int money) {
		this.Money = money;
	}
	public String getaddress() {
		return Address;
	}
	public void setaddress(String add) {
		this.Address = add;
	}
	public void Car() {
		if(Money>=2000000) {
			System.out.println("You can buy a car ");
		}else{
			System.out.println("Pls add a balance in your account");
		}
	}
	public void Visit() {
		if(Money>=1000000) {
			System.out.println("You can visit anywhere");
		}else {
			System.out.println("pls add a balance in your account");
		}
	}
	public void Account() {
		System.out.println("The balance in your Account is : "+Money);
	}
	
	
	public static void main(String[] args) {
		Encapsulation ep = new Encapsulation();
		ep.setname("Vishal");
		ep.setmoney(1000000000);
		ep.setaddress("Indore");
		
		System.out.println("Your Name is : "+ep.getname());
		System.out.println("Money in your account is : "+ep.getmoney());
		System.out.println("Your Address is : "+ep.getaddress());
		ep.Account();
		ep.Car();
		ep.Visit();
	
	}
	
}
