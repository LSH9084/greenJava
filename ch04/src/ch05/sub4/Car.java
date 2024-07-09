package ch05.sub4;


public class Car {
	
	// 속성(멤버 변수)은 무조건 private 선언하고 고치는게 편함 (거의다 private)
	// 상속관계에서는 자식요소가 참조할 수 있게 만들기위해 protected 사용
	protected String name;
	protected String color;
	protected int speed;
	
	
	public static int count;
	
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
	
	// 캡슐화 된 클래스 속성을 초기화 하는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	};
	
	public static int getTotalCount() {
		System.out.println("생산된 차량의 개수는 "+count+"대 입니다.");
		return count;
	}
	
	public Car() {};
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
