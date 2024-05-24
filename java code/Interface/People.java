package in.co.Interface;

public class People implements Businessman{

	@Override
	public void money(int a) {
		if(a==1) {
			System.out.println("Hello World");
		}
		if(a==2) {
			System.out.println("Hyy");
		}
		
	}

	@Override
	public void Help(int b) {
		if(b==1) {
			int c=b+1;
			System.out.println(c);
		}
		int d = b+b;
		if(b==2) {
			System.out.println(d);
		}
		
	}

	@Override
	public void Property(int c ) {
		if(c>5) {
			System.out.println("You are richman and a businessman");
		}
		
	}

	@Override
	public void Car(int d) {
		if(d==1) {
			System.out.println("You are a Richman");
		}
		
	}

	


	

}
