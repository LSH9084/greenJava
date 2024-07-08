package ch05.sub2;

/*
 *  날짜 : 2024/07*08
 *  이름 : 이상훈
 *  내용 : 캡슐화 실습하기
 */
public class EncapsTest {
	public static void main(String[] args) {
		
		// Car 객체 생성
		Car sonata = new Car();
		
		// 초기화
		sonata.setName("소나타");
		sonata.setColor("검은색");
		sonata.setSpeed(80);
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반떼", "흰색", 20);
		avante.speedUp(50);
		avante.show();
		
		
		Account kb = new Account();
		kb.setAcc("11-1305-6666-78");
		kb.setBank("국민은행");
		kb.setName("이상훈");
		kb.setBalance(100000000);
		
		kb.deposit(500000000);
		kb.show();
		
		
		Book book2 = new Book("혼자 공부하는 SQL", "우재남", "112-01-1102", 3);
		Book book = new Book("title1111", "이상훈", "2021546", 1);
		book.borrowBook();
		book.borrowBook();
		book.returnBook();
		book.show();
		
		
		
		book2.show();
	}
	
	
}
