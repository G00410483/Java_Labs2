package polymorphism;
class Dog extends Animal{
	void eat() {
		System.out.println("Dog Eating");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat Eating");
	}
}// end class
class Wolf extends Animal{
	void eat() {
		System.out.println("Wolf Eating");
	}
}//end class

class Hippo extends Animal{
	void eat() {
		System.out.println("Hippo Eating");
	}
}
class Lion extends Animal{
	void eat() {
		System.out.println("Lion Eating");
	}
}
public abstract class Animal {
	abstract void eat();
	
	public static void main(String[] args) {
	// create Animal array
		Animal[] animals = new Animal[5];
		animals[0]= new Dog();
		animals[1]= new Cat();
		animals[2]=new Wolf();
		animals[3]= new Hippo();
		animals[4]= new Lion();
		for (int i=0; i<animals.length; i++) {
		animals[i].eat();	
		}// end for loop

	}

}
