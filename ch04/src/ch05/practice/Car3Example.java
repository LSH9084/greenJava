package ch05.practice;

import ch05.Car3;

public class Car3Example {
	public static void main(String[] args) {
		
		Car3 myCar = new Car3();
		
		myCar.setGas(5);
		if(myCar.isLeftGas()) {
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
		
	}
}
