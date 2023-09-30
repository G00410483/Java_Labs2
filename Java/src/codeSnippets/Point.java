package codeSnippets;

public class Point {
int x,y,z;// current memory locations
//instance variables blue in eclipse
//#1 local and class variables same
Point(int x, int y){
	this.x=x;
	this.y=y;
}
//#2 call one constructor from another
// second constructor
Point(int x, int y,int z){
	this(x,y);// this keyword calls constructor #1
	// always first line of code
	this.z=z;
}
void setPoint(int x,int y) {
	this.x=x;//this.x is the current memory reference
	this.y=y;
}
void display() {
	System.out.println("x is "+x);
	System.out.println("y is "+y);
}
	public static void main(String[] args) {
		Point p = new Point(3,3);
		p.display();
		p.setPoint(5, 5);
		p.display();
		Point t = new Point(3,3,3);

	}

}
