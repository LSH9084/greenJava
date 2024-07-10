package ch05.sub7;

/*
 * 날짜 : 2024/07/10
 * 이름 : 이상훈
 * 내용 : 추상 클래스 실습하기
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		Animal Tiger = new Tiger();
		Animal Shark = new Shark();
		Animal Eagle = new Eagle();
		
		Tiger.hunt();
	}
}
