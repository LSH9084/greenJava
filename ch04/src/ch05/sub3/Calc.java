package ch05.sub3;

public class Calc {
	
	private static Calc instance = new Calc();  /// 싱글톤 객체 만들기!
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {}  // private으로 객체 생성을 막아버림
	
	public static int plus(int x, int y) {
		return x+y;
	}
	public static int minus (int x, int y) {
		return x-y;
	}
	public static int multi (int x, int y) {
		return x*y;
	}
	public static int div(int x , int y) {
		return x/y;
	}
}
