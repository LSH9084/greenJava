package ch05.sub5;

public class Sedan extends Car{
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name,color,speed); //부모클래스 생성자 호출해서 값 넣어줌
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		// Sedan에 맞게 재정의
		this.speed += speed*cc; 
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : "+cc);
	}
}
