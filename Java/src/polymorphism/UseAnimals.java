package polymorphism;
class Animals{
	
}
class Horse extends Animals{
	
}
public class UseAnimals {
	// overloaded methods- different arguments
	void doStuff(Animals a) {
		System.out.println("In the Animal version");
	}
	void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}

	public static void main(String[] args) {
		UseAnimals us = new UseAnimals();
		Animals animalObj = new Animals();
		Animals animalRefToHorse = new Horse();//polymorphic call
		Horse horseObj = new Horse();
		us.doStuff(animalObj);
		us.doStuff(horseObj);
		us.doStuff(animalRefToHorse);

	}

}
