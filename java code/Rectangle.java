package in.coTestInheritance;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle( String name, String color, int width,int height) {
		super (color, name);
		
		this.width = width;
		this.height = height;
	}

	@Override
	public int Area() {
		return width*height;
	}
	
	
}
