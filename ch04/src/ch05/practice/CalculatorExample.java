package ch05.practice;

public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		
		myCalc.powerOff();
		double result2 = myCalc.divide(10, 20);
		
	}
}
