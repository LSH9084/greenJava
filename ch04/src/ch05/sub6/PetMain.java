package ch05.sub6;

public class PetMain {
	public static void main(String[] args) {
		Pet dog = new Dog();
		Pet cat = new Cat();
		
		printSound(dog);
		printSound(cat);
	}
	
	public static void printSound(Pet a) {
		a.makeSound();
	}
}	
