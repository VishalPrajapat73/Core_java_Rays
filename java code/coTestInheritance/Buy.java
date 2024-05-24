package in.coTestInheritance;

public class Buy extends Person {
	private String name2;
	private String color;
	private double price;
	
	
	public Buy(String name, int Age, String name2, String color, double price) {
		super(name,Age);
		this.name2 = name2;
		this.color = color;
		this.price = price;
	}
	
	public String getname2() {
		return name2;
	}
	public String getcolor() {
		return color;
	}
	public double getprice() {
		return price;
	}
	
}
