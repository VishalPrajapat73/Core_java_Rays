package in.coNew;

public class Car {
	
	private String name;
	private int model;
	private int Engine;
	private String color;
	private double price;
	
	
	public Car(String name, int model, int Engine, String color, double price) {
		this.name = name;
		this.model = model;
		this.Engine = Engine;
		this.color = color;
		this.price = price;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getmodel() {
		return model;
	}
	public void setmodel(int model) {
		this.model = model;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
	public int getengine() {
		return Engine;
	}
	public void setengine(int Engine) {
		this.Engine = Engine;
	}
	
	public static void main(String [] args) {
		
		Car c = new Car("Rolls Royce",2024 ,1500, "Gold" ,10000000.000 );
		
		System.out.println("The name of Car is : "+c.getname());
		System.out.println("The model of car is : "+c.getmodel());
		System.out.println("The Engine cc is : "+c.getengine());
		System.out.println("The Color of Car is : "+c.getcolor());
		System.out.println("The Price of Car is : "+c.getprice());
	}
	
	
	
	
}
