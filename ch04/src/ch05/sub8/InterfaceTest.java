package ch05.sub8;

/*
 * 날짜 : 2024/07/11
 * 이름 : 이상훈
 * 내용 : 인터페이스
 * 	- 표준화된 클래스 설계에 사용되는 구조체
 * 	- 오직 추상 메서드만 선언
 */

public class InterfaceTest {
	public static void main(String[] args) {
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.powerOff();
		lg.soundDown();
		lg.soundUp();
		
		RemoteControl sg = new RemoteSamsung();
		sg.powerOff();
		sg.chUp();
		sg.chDown();
		
		//인터페이스 실습 2 - 다형성 예제
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		socket.switchOn();
		socket.switchOff();
		
		
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
	}
	
	
}
