package ch05.sub4;

public class StockAccount extends Account{
	
	private String stock;
	private int amount;
	private int price;
	public StockAccount(String bank, String acc, String name, int balance, String stock, int amount, int price) {
		super(bank,acc,name,balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	public void show() {
		super.show();
		System.out.println("==보유 주식==");
		System.out.println("주식종목 : "+stock);
		System.out.println("주식량 : "+amount);
		System.out.println("주당가격 : "+price);
	}
	
	public void buy(int amount, int price) {
		
		int result = amount*price;
		balance -= result;
		this.amount += amount;
		
	}
	
	public void sell(int amount, int price) {
		
		int result = amount*price;
		balance += result;
		this.amount -= amount;
	}

}
