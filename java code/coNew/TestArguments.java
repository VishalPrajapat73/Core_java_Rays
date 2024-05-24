package in.coNew;

public class TestArguments {
	public static void main (String []args) {
//		if(args.length==2) {
//			System.out.println("Hello"+args[0]);
//		}
//		else {
//			System.out.println("Parameter is not pass");
//		}
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		int div= c/b;
		System.out.println(div);
	}
}
