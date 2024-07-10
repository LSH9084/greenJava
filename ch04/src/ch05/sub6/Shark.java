package ch05.sub6;

public class Shark extends Animal{
	@Override
	public void move() {
		System.out.println("Shark swing...");
	}
	@Override
	public void hunt() {
		System.out.println("Shark hunt...");
	}
}
