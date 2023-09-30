package codeSnippets;

public abstract class Animal {
	//static method
	static void doStuff() {
		System.out.println("a");
	}
// static method
	static void doMoreStuff() {
		System.out.println("b");
	}
	//ONE abstract method - no body - forces class to be abstract
	abstract void doMoreStuffAgain();
	// method cannot be static and abstract #1
	 //static abstract void startStuff();
}
