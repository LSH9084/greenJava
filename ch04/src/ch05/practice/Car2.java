package ch05.practice;

public class Car2 {
	String company = "현대자동차";
	String model = "그렌져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	
	Car2() {};
	
	Car2(String model){
		this(model,"은색",250);
	}
	
	Car2(String model, String color){
		this(model, color, 250);
	}
	
	Car2(String m, String c, int max){
		this.model = m;
		this.color = c;
		this.maxSpeed = max;
	}
	
	public void show() {
		System.out.println("========================");
		System.out.println("모델:"+this.model);
		System.out.println("색:"+this.color);
		System.out.println("최고속력"+this.maxSpeed);
	}
	
}
