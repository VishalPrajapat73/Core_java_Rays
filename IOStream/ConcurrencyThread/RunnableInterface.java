package in.co.ConcurrencyThread;

public class RunnableInterface implements Runnable {

	String name = null;
	
	public RunnableInterface(String n) {
		name = n;
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+ name);
		}
		
	}

}
