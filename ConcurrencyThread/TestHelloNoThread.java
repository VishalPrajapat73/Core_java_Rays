package in.co.ConcurrencyThread;

public class TestHelloNoThread {
	public static void main(String[] args) {
		
//		HelloNoThread t1 = new HelloNoThread("Ram");
//		HelloNoThread t2 = new HelloNoThread("Sita");
		
		
		
		HelloThread t = new HelloThread("Hello");
		HelloThread u = new HelloThread("Hyy");
		
//		t.run();
//		u.run();
		t.setPriority(5);
//		int j = t.getPriority();
		t.start();
		u.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main"+t.getPriority());
		}
		
//		t1.run();
//		t2.run();
//		
//		Thread t1 = new Thread(new RunnableInterface("Ram"));
//		Thread t2 = new Thread(new RunnableInterface("Sita"));
//		
//		t1.start();
//		t2.start();
//		
//		for(int i=0;i<5;i++) {
//			System.out.println("Main");
//		}
	}
}
