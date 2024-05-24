package in.coTestInheritance;

public class test {
	public static void main(String[] args) {
//		Rectangle r = new Rectangle("Rectangle","Blue",10,20);
//		Triangle T = new Triangle("Triangle","Red",5,4);
//		System.out.println(T.getname());
//		System.out.println(T.getcolor());
//		System.out.println(T.Area()); 
//		
//		System.out.println(r.getname());
//		System.out.println(r.getcolor());
//		System.out.println(r.Area());
		
		
		
		Account A = new Account("Vishal" , 19, "Saving" , 12345, 1000000.00);
		System.out.println("Account Information ");
		System.out.println(A.getname());
		System.out.println(A.getage());
		System.out.println(A.getaccounttype());
		System.out.println(A.getaccountno());
		System.out.println(A.getbalance());
		Buy B = new Buy("Vishal" , 19, "Fortuner" , "White" , 100000.00);
		System.out.println("Buy a Car ");
		System.out.println(B.getname());
		System.out.println(B.getage());
		System.out.println(B.getname2());
		System.out.println(B.getcolor());
		System.out.println(B.getprice());
		
	}
	
}
