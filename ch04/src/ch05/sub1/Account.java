package ch05.sub1;

public class Account {
	String bank;
	String acc;
	String name;
	int balance;
	
	public void deposit(int balance) {
		this.balance += balance;
	}
	
	public void withdraw(int balance) {
		this.balance -= balance;
	}
	
	public void show() {
		System.out.println(
				"==========================\n"
				+"은행명 : " + this.bank +"\n"
				+"계좌번호 : "+this.acc +"\n"
				+"입금주 : "+this.name +"\n"
				+"계좌잔액 : "+this.balance+"\n"
				+"=========================="
				);
		
	}
}
