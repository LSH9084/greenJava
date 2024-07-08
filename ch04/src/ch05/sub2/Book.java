package ch05.sub2;

public class Book {
	
	private String title;
	private String author;
	private String isbn;
	private int availableCopies;
	boolean check;
	
	public Book(String title, String author, String isbn, int available) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.availableCopies = available;
	}
	
	public boolean borrowBook() {
		
		if(this.availableCopies>=1) {
			this.availableCopies -= 1;
			check = true;
			System.out.println("대출 성공! 이용가능한 복사본 수 : "+this.availableCopies);
		} else {
			check = false;
			System.out.println("대출 실패! 이용가능한 복사본 수가 없습니다.");
		}
		
		return check;
	}
	
	
	public void returnBook() {
		this.availableCopies += 1;
		System.out.println("이용가능한 복사본 수 : "+this.availableCopies);
	}
	
	public void show() {
		System.out.println("===============================");
		System.out.println("책 제목 : "+this.title);
		System.out.println("책 저자 : "+this.author);
		System.out.println("ISBN 번호 : "+this.isbn);
		System.out.println("이용 가능한 복사본 수 : "+this.availableCopies);
		System.out.println("===============================");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}
	
	
	
	
}
