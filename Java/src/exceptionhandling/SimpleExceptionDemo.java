package exceptionhandling;
class SimpleException extends Exception{}

public class SimpleExceptionDemo {
	// method f() throws an Exception type object
public void f()  throws SimpleException{
	System.out.println("Throwing SimpleException from f()");
    throw new SimpleException();
}

	public static void main(String[] args) {
	SimpleExceptionDemo sed= new SimpleExceptionDemo();
	try {
		sed.f();
	} catch (SimpleException e) {
		System.err.println("caught it");
		e.printStackTrace();
	}
	}

}
