package in.co.Exception;

public class CA {
	
	double money;
	
	public double getmoney() {
		return money;
	}
	public void setmoney(double money) {
		this.money = money;
	}
	
	public double amount(double amount)throws Company {
		if(money<amount) {
			throw new Company("Stock price is high pls add a balance in your company account");
		}
		if(money>=amount){
			throw new Company("You can buy this company stock");
		}
		return amount;
	}
	
	
}
