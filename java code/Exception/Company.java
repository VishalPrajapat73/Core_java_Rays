package in.co.Exception;

public class Company extends Exception {
	public Company(String msg) {
		super(msg);
	}
	
	public static void main(String [] args)  {
		CA c = new CA();
		c.setmoney(1000000);
		System.out.println("available balance in your account is : "+c.getmoney());
		try {
			c.amount(20000);
		}catch(Company e) {
			System.err.println(e.getMessage());
		}
		
	}
}
