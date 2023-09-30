package codeSnippets;

public class Test {
int i=5;
int x;
Test(int i) {
	this.i=i;
}

//Explicit default constructor
Test(){
	i=99;
};
	public static void main(String[] args) {
		Test t = new Test(8);// using default constructor
	}

}
