package threads;
class FooRunnable implements Runnable{

	@Override
	public void run() {
	for(int x=1;x<6;x++) {
		System.out.println("Runnable running");
	}// end for loop
		
	}//end method
	
}//end class
public class TestThreads {

	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		Thread t = new Thread(r);
		t.start();

	}

}
