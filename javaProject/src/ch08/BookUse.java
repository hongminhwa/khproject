package ch08;

public class BookUse {  
	public static void main(String[] args) {
		Book b = new Book("자바","홍길동","영진",2017,450000, 5);
		b.print();
		
		Book b2 = new Book();
		b2.print();
		
	}

}
