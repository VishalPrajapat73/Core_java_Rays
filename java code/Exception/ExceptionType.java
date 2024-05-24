package in.co.Exception;

public class ExceptionType {
		public static void main (String[] args) {
			
//			Arithmetic Exception
			
//			int a=10;
//			int b=0;
//			try {
//				int div=a/b;
//				System.out.println(div);
//			}catch(ArithmeticException e) {
//				System.out.println( " ArithmeticException");
//			}
		
			
//			String IndexoutofBoundsException
			
//		String name = "Vishal";
//		try {
//			System.out.println(name.charAt(7));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
			
			
//		NumberFormatException	
			
//		String a = "Vish9al";	
//		
//		try {
//			int i = Integer.parseInt(a);
//			System.out.println(a);
//		}catch(NumberFormatException e) {
////			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//			
			
//		ArrayIndexOutOfBoundsException
			
//		String[] str = {"a","b","c","d","d"};
//		try {
//			System.out.println(str[9]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}
			
			
//			NullPointerException
			
//		String a = null;
//		try {
//			System.out.println(a.length());
//		}catch(NullPointerException e) {
//			e.printStackTrace();
////			System.out.println(e.getMessage());
//		}
			
		String name = "Rar";
		try {
			System.out.println(name.charAt(5));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Hello I am Always Executed ");
		}
			
			
		}
	
}
