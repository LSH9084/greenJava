package ch05.sub4;

public class Account {
	protected String bank;
	protected String acc;
	protected String name;
	protected int balance;
	
	public void deposit(int balance) {
		this.balance += balance;
	}
	
	public void withdraw(int balance) {
		this.balance -= balance;
	}
	
	
	public Account(String bank, String acc, String name, int balance) {
		super();
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
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

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
