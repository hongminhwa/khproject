package ch09;

public class Saleuse {  
	public static void main(String[] args) {
		Sale s1 = new Sale();
		s1.input(1, "세탁기", "삼성", "20220103", 200, 1);
		s1.calc();
		s1.print();
		
	}

}
