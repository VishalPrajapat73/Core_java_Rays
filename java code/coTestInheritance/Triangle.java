package in.coTestInheritance;

public class Triangle extends Shape {
	
	private int height;
	private int base;
	
	public Triangle(String name, String color , int base, int height) {
		super(color, name);
		
		this.height = height;
		this.base = base;
	}
	


	@Override
	public int Area() {
		
		return base*height/2;
	}
		
//	public int Area() {
//		
//		return base*height/2;
//	}
	
}
