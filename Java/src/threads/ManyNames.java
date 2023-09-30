package threads;
class ManyRunnable implements Runnable{
	@Override
	public void run() {
	for(int x=1;x<=3;x++) {
		System.out.println("Run by "
	+Thread.currentThread().getName() +" x is " +x);
	}// end for loop
		
	}// end method
}
public class ManyNames {

	public static void main(String[] args) {
		ManyRunnable mr = new ManyRunnable();
		Thread one = new Thread(mr);
		Thread two = new Thread(mr);
		Thread three= new Thread(mr);
		one.setName("fred");
		two.setName("lucy");
		three.setName("ricky");
		one.start();
		two.start();
		three.start();

	}

}
