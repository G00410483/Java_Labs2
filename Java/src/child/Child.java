package child;

import parent.*;

public class Child extends Parent {
public void testIt() {
	System.out.println("x is "+x);// int x declares in
	//Parent class
}
	public static void main(String[] args) {
		Parent p = new Parent();//Parent object
		Child c = new Child();//Child object
		// cannot access 'x' from Parent class - protected
	//System.out.println("X in parent is "p.x);	
	// 'x' in Parent class can be accessed through inheritance
	// even though Child and Parent classes
		// are in different packages
	System.out.println("Subclass can only be accessed through "
			+ "inheritance so x is "+c.x);
	

	}

}
