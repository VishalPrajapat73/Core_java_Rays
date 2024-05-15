package in.coTestInheritance;

public class test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle("Rectangle","Blue",10,20);
		Triangle T = new Triangle("Triangle","Red",5,4);
		System.out.println(T.getname());
		System.out.println(T.getcolor());
		System.out.println(T.Area()); 
		
		System.out.println(r.getname());
		System.out.println(r.getcolor());
		System.out.println(r.Area());
		
	}
	
}
