package ch05.sub4;

public class InheritanceTest {
	public static void main(String[] args) {
		
		//부모 요소도 heap 메모리에 단일 인스턴스로 만들어지고 자식요소도 만들어진다.
		
		Car sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(100);
		sonata.speedDown(40);
		sonata.show();
		
		Car bongo = new Truck("봉고", "남색", 0, 1000);
		bongo.speedUp(100);
		bongo.speedDown(20);
		bongo.show();
		
		
		StockAccount kb = new StockAccount("kb증권","101-11-1001","홍길동",10000,"한화생명",0,50000);
		kb.deposit(1000000);
		kb.buy(20,50000);
		kb.sell(10,50000);
		kb.show();
	}
}
