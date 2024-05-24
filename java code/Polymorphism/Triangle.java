package in.co.Polymorphism;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		return base*height;
	}
}
