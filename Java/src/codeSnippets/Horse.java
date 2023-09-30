package codeSnippets;

public class Horse extends Animal {

	//#3 cannot override a static method but you can redefine it
	static void doStuff() {
		System.out.println("c");
	}
	static void doMoreStuff() {
		System.out.println("d");
	}
	// #2 override abstract method top class-same method signature
	// implemented because of curly brace
	@Override
	void doMoreStuffAgain() {
		System.out.println("e");
	}
	public static void main(String[] args) {
	Horse h = new Horse();
	h.doMoreStuffAgain();// using the overridden method

	}

}
