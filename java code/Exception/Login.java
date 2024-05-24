package in.co.Exception;


//import java.util.*;
public class Login {
	public static void main(String[] args)throws LoginException {
//		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Enter User Name ");
		String name = "Vishal";
//		name = scan.nextLine();
//		System.out.println("Enter Your Password ");
		String pass = "Vishal@7354";
//		pass = scan.nextLine();
//		scan.close();
//		if(name=="Vishal"||name=="Vishal") {
//			throw new LoginException();
//		}
//		if(pass=="Vishal1234"||pass=="Vishal234") {
//			throw new LoginException();
//		}
//		else {
//			System.out.println("Login Succefully ");
//		}
		
		
		if(name==null||name!="Vishal") {
			throw new LoginException();
		}if(pass==null||pass!="Vishal@7354") {
			throw new LoginException();
			
		}else {
			System.out.println("Login Succefully");
		}
	}
}
