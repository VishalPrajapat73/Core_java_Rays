package in.coNew;

import java.util.Scanner;
public class New {
			
	public static void Add(int a, int b) {
		int sum = a+b;
		System.out.println("The sum of a and b is : "+sum);
	}
	public static void sub(int a, int b) {
		int sub = a-b;
		System.out.println("The sub of a and b is : "+sub);
	}
	public static void mul (int a, int b) {
		int mul = a*b;
		System.out.println("The mul of a and b is : "+mul);
	}
	public static void div(int a, int b) {
		int div = a/b;
		System.out.println("The div of a and b is : "+div);
	}
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Variable of a : ");
		int a = sc.nextInt();
		System.out.println("Enter Variable of b : ");
		int b = sc.nextInt();
		sc.close();	
		New.Add(a, b);
		New.sub(a, b);
		New.mul(a, b);
		New.div(a, b);
		
	}
	
}		
