package ch07;

public class PersonUse2 {    
	public static void main(String[] args) {
		
		
		Person2 knou = new Person2();
		knou.setname("홍길동");
		knou.setAge(30); 
		knou.setEmail("hong@naver.com");
		knou.setAddress("서울시 강남구 압구정동");
		
		System.out.println("이름: " + knou.getName());
		System.out.println("나이 : " + knou.getAge());
		System.out.println("이메일 :" + knou.getEmail());
		System.out.println("주소 :" + knou.getAddress());
		
		
		
		Person2 bnb = new Person2();
		
		
		bnb.setname("신사임당"); 
		bnb.setAge(25);
		bnb.setEmail("shin@gmail.com"); 
		bnb.setAddress("서울시 종로구 혜화동");
		
		
		System.out.println("이름: " + bnb.getName());
		System.out.println("나이 : " + bnb.getAge());
		System.out.println("이메일 주소 :" + bnb.getEmail());
		System.out.println("집 주소  :" + bnb.getAddress()); 
		
	    
		
	}
	
	
	  
		
}