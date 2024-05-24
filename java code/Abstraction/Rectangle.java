package in.co.Abstraction;

public class Rectangle extends Shape {
	private int length;
	private int width;
	
	public Rectangle() {
		System.out.println("Hello i'm Rectangle ");
	}
	
	public Rectangle (int length, int width) {
		this.length = length;
		this.width  = width;
	}
	
	@Override 
	public double area() {
		return length*width;
	}
}
