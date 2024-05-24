package in.co.Polymorphism;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
}
