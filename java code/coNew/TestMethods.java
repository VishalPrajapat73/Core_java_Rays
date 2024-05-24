package in.coNew;

public class TestMethods {
		public static int Add(int a , int b) {
			int Sum=a+b;
			return Sum;
		}
		public static void Div(int a, int b) {
			System.out.println(a/b);
		}
		public void Mul(int a, int b) {
			int Mul=a*b;
			System.out.println("Multiply is : "+Mul);
		}
		public int sub(int a , int b) {
			return a-b;
		}
	
		public static void Hii() {  // This method will be call by direct class name or object name
			System.out.println("Hello");
		}
		public static void Add(int a, int b) {
			System.out.println(a+b);
		}
		public void Sub(int a, int b) {// This method will be call by using object name
			int sub=a-b;
			System.out.println(sub);
		}
		public int Div(int a , int b) { // This method is call by using object name in SOUT 
			int div=a/b;
			return div;
		}
		
	
		public static void main(String []args) {
			
			TestMethods.Hii();
			TestMethods.Add(10, 20);
			TestMethods c = new TestMethods();
//			c.Div(10, 5);
			System.out.println(c.Div(10, 5));
			c.Add(10, 99);
			c.Sub(100, 100);
//			c.Div(1000, 10);
			System.out.println(c.Div(100, 100));
			c.Hii();
			
			
			
			
			//			TestMethods.Add(10, 20);
//			System.out.println(TestMethods.Add(10, 20));
//			TestMethods c = new TestMethods();
//			c.Mul(2, 3);
//			c.sub(10, 5);
//			System.out.println(c.sub(10, 5));
//			TestMethods.Div(20, 5);
//			c.Div(100, 100);
		}
}
