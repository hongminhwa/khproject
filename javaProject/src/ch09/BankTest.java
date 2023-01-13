package ch09;


class Bank{
	double getInterestRate() {
		return 0.0; 
		
	}
}

 class Badbank extends Bank {
	 // 어노테이션이라고 하며 컴파일러에게 추가적인 정보를 제공하는 메타데이터로 
	 // 주석으로 활용하거나 또는 프로그램에게 특정기능을 정의하거나 실행하도록 정보 제공용으로 사용한다.
	 // Spring에서 본격적으로 활용한다. 
	 
	 double getInterestRate() {   // 메소드 오버라이딩의 목적은 재정의 
		 return 10.0;     //  super.getInterestRate(); 
		 
	 }
	 
}
 class NormalBank extends Bank {
	 double getInterestRate() {
		 return 5.0; 
		 
	 }
 }
class GoodBank extends Bank {
	double getInterestRate() {
		return 3.0; 
	}
}

 public class BankTest {
	 public static void main(String[] args) {
		  Badbank b1 = new Badbank();
		  NormalBank b2 = new NormalBank();
		  GoodBank b3 = new GoodBank();
		  System.out.println("BadBank의 이자율 :" + b1.getInterestRate());
		  System.out.println("normalbank의 이자율 :" + b2.getInterestRate());
		  System.out.println("Goodbank의 이자율 : " + b3.getInterestRate()); 
		  
	}
 }











//public class BankTest {  public static void main(String[] args) {
//	
//	
//}
//
//}
