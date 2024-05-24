package in.coNew;

public class Method {
	
	public static void Hii() {
		System.out.println("Hello ");
	}
	public static void Add(int a , int b) {
		System.out.println(a+b);
	}
	public void Sub(int a, int b) {
		int sub  = a-b;
		System.out.println(sub);
	}
	public int Div(int a, int b) {
		int div = a/b;
		return div;
	}
	
	public static void main(String[] args) {
		Method.Hii();
		Method.Add(10, 20);
		Method c = new Method();
		c.Sub(10, 5);
//		c.Div(100, 1);
		System.out.println(c.Div(1000, 10));
		
	}
}
