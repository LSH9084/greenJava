package ch05.practice;

public class Calculator {
	boolean check = false;
	void powerOn() {
		System.out.println("전원을 켭니다.");
		this.check = true;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
		this.check = false;
	}
	
	int plus(int x ,int y) {
		int result = 0;
		if(this.check) {
			result = x+y;
			System.out.println("합은="+result);
			return result;
		} else {
			System.out.println("전원을 켜주세요!!!");
			return 0;
		}	
	}
	
	double divide(int x, int y) {
		if(check) {
			double result = (double)x/(double)y;
			System.out.println("나누기="+ result);
			return result;
		} else {
			System.out.println("전원을 켜주세요!!!");
			return 0.0;
		}
		
		
	}
}
