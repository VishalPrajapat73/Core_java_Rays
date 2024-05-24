package in.co.Abstraction;

public class Car extends Vehicles {

	@Override
	public void speed(int a) {
		if(a>=1) {
			System.out.println("Speed is a equal to 1 "+a);
		}else {
			System.out.println("Speed is greater than 1 "+a);
		}
		
	}

	@Override
	public void Gear(int b) {
		if(b==1) {
			System.out.println("Speed limit is 30-40");
		}
		if(b==2) {
			System.out.println("Speed limit is 40-5-");
		}
		if(b==3) {
			System.out.println("Speed limit is 50-60");
		}
		if(b>3) {
			System.out.println("Speed limit is greater than 60 and less than 120");
		}
		
	}

	

}
