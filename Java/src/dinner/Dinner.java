package dinner;

import dessert.Cookie;

public class Dinner {
//constructor
	public Dinner() {
		System.out.println("Dinner Constructor");
	}
	public static void main(String[] args) {
		Cookie x = new Cookie();
		Cake y = new Cake();
	//	x.bite(); //friendly access- cant use 
		y.bite();// friendly access - Dinner and Cake
		// classes in same package

	}

}
