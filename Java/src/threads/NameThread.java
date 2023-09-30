package threads;
class NameRunnable implements Runnable{

	@Override
	public void run() {
System.out.println("Name Runnable Running");
System.out.println("Run by "+Thread.currentThread().getName());
		
	}
	
}
public class NameThread {

	public static void main(String[] args) {
	System.out.println("thread is "
	+Thread.currentThread().getName());
	NameRunnable nr = new NameRunnable();
	Thread t = new Thread(nr);
	//t.setName("Fred");
	t.start();
			

	}

}
