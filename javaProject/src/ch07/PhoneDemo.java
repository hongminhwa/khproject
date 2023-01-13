package ch07;

// 한개 파일에 2개 이상의 class를 작성할 때 main 메소드가 있는 public class를 클래스 이름으로 저장해야함. 
// 다른 타입의 접근제어장치가 default값으로 처리되어야함. 

class Phone {
	String model;
	int value; 
	void print() {
		System.out.println(value + "만원짜리" + model + "스마트폰" );
	}
}



public class PhoneDemo { public static void main(String[] args) {
	   Phone myPhone = new Phone(); 
	   myPhone.model = "갤럭시 s21";
	   myPhone.value  = 100; 
	   myPhone.print(); 
	   
	   Phone yourPhone = new Phone(); 
		yourPhone.model = "아이폰.";
		yourPhone.value = 300; 
		myPhone.print();  
		
		
		
		
		
}       

	
	
	 

}
