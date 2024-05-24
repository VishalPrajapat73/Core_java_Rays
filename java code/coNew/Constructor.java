package in.coNew;


public class Constructor {
	public Constructor() {
		System.out.println("Hello i am default Constructor");
	}
	public Constructor(int a) {
		this();
		System.out.println("i am parametrised constructor");
	}
	public Constructor(int a , int b) {
		this(a);
		System.out.println("i am two parameterised constructor");
	}
	public Constructor(int a , int b , int c) {
		this(a,b);
		System.out.println("i am three parametrised constructor");
	}
	public static void main(String[] args) {
		
		Constructor c = new Constructor(10,20);
	}
	
}
