package ch05.sub1;

public class Car {
	
	// 속성(멤버 변수) 
	String name;
	String color;
	int speed;
	
	// 기능
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량 색상 : " + this.color);
		System.out.println("현재 속도 : " + this.speed);
	}
	
}
