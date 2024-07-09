package ch05.sub3;

/*
 * 날짜 : 2024/07/09
 * 이름 : 이상훈
 * 내용 : 클래스변수, 메서드 실습하기
 * 
 * 클래스 변수 , 메서드(정적변수, 메서드)
 *  - static 선언한 변수, Method Area에 생성
 *  - 별도의 객체 생성없이 클래스 타입으로 바로 참조
 *  - 객체간의 데이터 공유 목적으로 클래스변수, 메서드 사용
 *  
 * 싱글톤 객체
 *  - 클래스 변수, 메서드를 활용한 객체 생성 방법
 *  - 싱글톤 객체는 오직 하나의 인스턴스로 메모리상에(Method Area) 존재한다.
 *  - 사용하는 이유 : 메모리 관리를 효율적으로 하기 위해서
 */



public class StaticTest {
	public static void main(String[] args) {
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();   
		// 클래스 멤버변수 num1 num2를 정적메서드로 만들지 않으면 객체의 값은 전부 다름 콘솔 1 1 1 1
		
		//하지만 클래스 멤버변수를 정적변수로 만들어주면 하나의 값에 계속해서 업데이트가됨 콘솔 1 1 2 2
		
		System.out.println("==============================");
		//Car 실습
		Car sonata = new Car("소나타","흰색",0);
		Car avante = new Car("아반떼","검정",0);
		
		Car.getTotalCount();
		
	
		// 싱글톤 객체!
		// 메모리를 효율적으로 만들기 위해
		// 싱글톤객체를 만들면 method area에서 만들어서 하나의 저장소만 사용
		// 여러개의 메모리를 heap에 생성할 필요가 없으면 싱글톤이 더 효율적인 방식
		Calc c1 = Calc.getInstance();
		
		int r1 = c1.plus(1, 2);
		int r2 = c1.minus(1, 2);
		int r3 = c1.multi(3, 2);
		int r4 = c1.div(4, 2);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
	}
}

class Increment {
	private int num1;
//	private int num2;
	
//	static private int num1;
	static private int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("====================="+"\nnum1: "+num1+"\nnum2: "+num2);
	}
}
