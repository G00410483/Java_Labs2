package polymorphism;

class Shape{
	void draw() {}
	void erase() {}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle.draw()");
	}//end method
	void drawBiggerCircle() {
		System.out.println("Bigger Circle");
	}
}//end class Circle

class Triangle extends Shape{
	void draw() {
		System.out.println("Triangle.draw()");
	}//end method
}//end class
class Square extends Shape{
	void draw() {
	System.out.println("Square.draw()");	
	}//end method
}
public class Shapes {
public static Shape randShape() {
	switch((int)(Math.random()*3)) {
	default:
	case 0: return new Circle();
	case 1: return new Square();
	case 2: return new Triangle();
	
	}//end switch statement
	
}//end method
	public static void main(String[] args) {
		Shape c =new Circle();
		//c.drawBiggerCircle();
		//Shape array
		Shape[] s = new Shape[9];
		//fill up the array with shapes
		for(int i=0;i<s.length;i++)
			s[i]=randShape();
		//Make polymorphic method calls
		for(int i=0;i<s.length;i++)
			s[i].draw();

	}

}
