package ch05.practice;

public class Car2Example {
	public static void main(String[] args) {
		
		Car2 myCar = new Car2();
		
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+ myCar.model);
		System.out.println("색:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도:"+myCar.speed);
		
		
		Car2 myCar4 = new Car2("app1", "블루");
		
		Car2 myCar3 = new Car2("자가용");
		myCar3.show();
		
		Car2 myCar2 = new Car2("택시","황금색");
		myCar2.show();
		
		Car2 myCar5 = new Car2("버스","초록색",100);
		myCar5.show();
	}
}
