package in.co.ConcurrencyThread;

public class TestRacingCondThread   {
	
	public static void main(String[] args) {
		
		RacingCondThread t1  = new RacingCondThread("Ram");
		RacingCondThread t2  = new RacingCondThread("Sita");
		
		t1.start();
		t2.start();
		
	}
	
}	
