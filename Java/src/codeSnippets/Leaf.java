package codeSnippets;

public class Leaf {
int i=0;
// method returns an object reference
Leaf increment() {
	i++;
	//put this line in to see reference
	System.out.println(this);
	return this;
}

void print() {
	System.out.println("i = "+i);
}
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();

	}

}
