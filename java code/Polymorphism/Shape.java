package in.co.Polymorphism;

public class Shape {
	public Shape() {
		
	}
	public double area() {
		return 0;
	}
	
	public static Shape getshape(int i) {
		if(i==1) {
			return new Rectangle(5,6);
		}
		if(i==2) {
			return new Circle(5);
		}
		if(i==3) {
			return new Triangle(10,20);
		}
		return new Shape();
	}
}
