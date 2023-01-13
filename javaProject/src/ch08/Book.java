package ch08;

public class Book {
	private String bookName;
	private String author;
	private String press; 
	private int year; 
	private int price;
	private int amount; 
	private int money;
	public Book() {
		this("자바", "홍길동", "한빛", 2020, 8000, 10);  // 다른 생성자 호출시 반드시 첫째줄.  
		System.out.println("");
		
	}
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		System.out.println("매게변수가 있는 생성자 호출");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount; 
		
	} 
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액 \t"); 
		System.out.println(bookName + "\t" + author + "\t" + press + "\t" + year + "\t" + price 
				+ "\t" + amount + "\t" + money);
	}
	
	

}
