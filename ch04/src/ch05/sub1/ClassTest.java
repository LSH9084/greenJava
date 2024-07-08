package ch05.sub1;

/*
 *	날짜 : 2024/07/08
 *	이름 : 이상훈
 *	내용 : 클래스와 객체 실습하기 
 */

public class ClassTest {
	public static void main(String[] args) {
		
		//객체 생성
		Car sonata = new Car();
		
		//객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(100);
		sonata.speedDown(20);
		sonata.show();
		
		
		Car avante = new Car();
		avante.name = "아반떼";
		avante.color = "검정색";
		avante.speed = 0;
		
		avante.speedUp(50);
		avante.speedDown(20);
		avante.show();
		
		//객체 생성
		Account kb = new Account();
		
		//객체 초기화
		kb.bank = "국민은행";
		kb.acc = "101-21-1001";
		kb.name = "김유신";
		kb.balance = 100000;
		
		//객체 활용
		kb.deposit(40000);
		kb.withdraw(3000);
		kb.show();
		
		//객체 생성
		Account wl = new Account();
		
		wl.bank = "우리은행";
		wl.acc = "101-22-1001";
		wl.name = "김춘추";
		wl.balance = 10000;
		
		wl.deposit(20000);
		wl.withdraw(15000);
		wl.show();
	}
}

